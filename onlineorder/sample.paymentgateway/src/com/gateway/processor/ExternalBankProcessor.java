package com.gateway.processor;

import com.payment.factory.BankFactory;
import com.payment.api.PaymentProcessor;
import com.payment.response.CustomerResponse;

public class ExternalBankProcessor {

    private PaymentProcessor paymentProcessor = BankFactory.getOnlinePaymentProcessorInstance();

    public CustomerResponse processPaymentWithExternalBank(final String cardNumber, final String cardType, final double amount) {
        System.out.println("Processing payment with external bank");
        return paymentProcessor.processPayment(cardNumber, cardType, amount);
    }
}
