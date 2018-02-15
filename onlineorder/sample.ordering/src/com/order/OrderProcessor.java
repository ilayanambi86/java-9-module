package com.order;

import com.gateway.factory.PaymentGatewayFactory;
import com.gateway.api.GatewayProcessor;
import com.notifications.EmailNotification;
import com.notifications.Notification;

public class OrderProcessor implements Processor {
    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder();
    }

    @Override
    public void processOrder() {
        GatewayProcessor gatewayProcessor = PaymentGatewayFactory.getGatewayProcessorInstance();
        gatewayProcessor.processPayment("1234 5678 9101 1121", "VISA", 10.01);
        Notification notification = new EmailNotification();
        notification.sendNotificaion("Order #123456 processed", "user@user.com");
    }
}
