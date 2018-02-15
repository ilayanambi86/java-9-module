package com.gateway.processor;

import com.payment.api.PaymentProcessor;
import com.payment.request.PaymentRequest;

import java.util.ServiceLoader;

public class ExternalBankProcessor {

    public boolean processPaymentWithExternalBank(final PaymentRequest paymentRequest) {
        ServiceLoader<PaymentProcessor> serviceLoader = ServiceLoader.load(PaymentProcessor.class);
        PaymentProcessor paymentProcessor = serviceLoader.iterator().next();
        return paymentProcessor.processPayment(paymentRequest).isTransactionStatus();
    }
}
