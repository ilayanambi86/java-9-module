package com.payment.api;

import com.payment.response.CustomerResponse;

public interface PaymentProcessor {
    CustomerResponse processPayment(final String cardNumber, final String cardType, final double amount);
}
