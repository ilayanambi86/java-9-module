package com.order;

import com.gateway.api.GatewayProcessor;
import com.gateway.enums.CardType;
import com.gateway.request.GatewayRequest;
import com.notifications.EmailNotification;
import com.notifications.Notification;

import java.util.NoSuchElementException;
import java.util.ServiceLoader;

public class OrderProcessorService implements Processor {
    public static void main(String[] args) {
        OrderProcessorService orderProcessorService = new OrderProcessorService();
        orderProcessorService.processOrder();
    }

    @Override
    public void processOrder() {
        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest.setCardNumber("1234 1234 1234 1234");
        gatewayRequest.setAmount(10.02);
        gatewayRequest.setCardType(CardType.VISA);

        ServiceLoader<GatewayProcessor> serviceLoader = ServiceLoader.load(GatewayProcessor.class);
        GatewayProcessor gatewayProcessor = serviceLoader.iterator().next();

        if(gatewayProcessor.processPayment(gatewayRequest)) {
            System.out.println("Payment processed successfully!!");
            Notification notification = new EmailNotification();
            notification.sendNotificaion("Order #123456 processed", "user@user.com");
        } else {
            System.out.println("Payment rejected.");
        }
    }
}
