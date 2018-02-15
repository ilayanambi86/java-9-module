package com.gateway.processor;

import com.gateway.api.GatewayProcessor;
import com.payment.response.CustomerResponse;

public class PaymentGatewayProcessor implements GatewayProcessor {
    private ExternalBankProcessor processor = new ExternalBankProcessor();

    @Override
    public CustomerResponse processPayment(final String cardNumber, final String cardType, final double amount) {
        return processor.processPaymentWithExternalBank(cardNumber, cardType, amount);
    }
}
