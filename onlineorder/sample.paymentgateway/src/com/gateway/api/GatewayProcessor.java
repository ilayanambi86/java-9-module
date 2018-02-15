package com.gateway.api;

import com.payment.response.CustomerResponse;

public interface GatewayProcessor {
    CustomerResponse processPayment(final String cardNumber, final String cardType, final double amount);
}
