package com.payment.processor;

import com.payment.response.CustomerResponse;
import com.payment.request.PaymentRequest;

public interface Card {
    CustomerResponse processPayment(PaymentRequest paymentRequest);
}
