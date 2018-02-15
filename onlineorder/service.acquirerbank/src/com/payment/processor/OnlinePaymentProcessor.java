package com.payment.processor;

import com.payment.request.PaymentRequest;
import com.payment.response.CustomerResponse;
import com.payment.enums.CardType;
import com.payment.api.PaymentProcessor;

public class OnlinePaymentProcessor implements PaymentProcessor {
    private Card visaCardPaymentProcessor = new VISACardPaymentProcessor();
    private Card masterCardPaymentProcessor = new MasterCardPaymentProcessor();

    @Override
    public CustomerResponse processPayment(final PaymentRequest paymentRequest) {
        System.out.println("AcquirerBank: Received payment request for card "+paymentRequest.getCardNumber());
        CustomerResponse customerResponse = new CustomerResponse();
        if (paymentRequest.getCardType().equals(CardType.VISA)) {
            customerResponse = visaCardPaymentProcessor.processPayment(paymentRequest);
        } else if (paymentRequest.getCardType().equals(CardType.MASTER)) {
            customerResponse = masterCardPaymentProcessor.processPayment(paymentRequest);
        }
        return customerResponse;
    }
}
