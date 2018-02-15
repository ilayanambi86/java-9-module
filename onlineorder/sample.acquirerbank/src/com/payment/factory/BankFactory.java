package com.payment.factory;

import com.payment.api.PaymentProcessor;
import com.payment.processor.OnlinePaymentProcessor;

public class BankFactory {

    private BankFactory() {
    }

    public static PaymentProcessor getOnlinePaymentProcessorInstance() {
        return new OnlinePaymentProcessor();
    }
}
