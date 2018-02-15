package com.payment.processor;

import com.payment.request.PaymentRequest;
import com.payment.response.CustomerResponse;

public interface Card {
    CustomerResponse processPayment(final PaymentRequest paymentRequest);
}
