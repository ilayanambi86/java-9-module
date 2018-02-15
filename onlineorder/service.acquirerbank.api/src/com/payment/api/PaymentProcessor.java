package com.payment.api;

import com.payment.request.PaymentRequest;
import com.payment.response.CustomerResponse;

public interface PaymentProcessor {
    CustomerResponse processPayment(final PaymentRequest paymentRequest);
}
