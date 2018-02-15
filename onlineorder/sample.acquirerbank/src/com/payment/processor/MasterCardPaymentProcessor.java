package com.payment.processor;

import com.payment.response.CustomerResponse;
import com.payment.request.PaymentRequest;

public class MasterCardPaymentProcessor implements Card{
    @Override
    public CustomerResponse processPayment(final PaymentRequest paymentRequest) {
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setFname("Ilayanambi");
        customerResponse.setLname("Ponramu");
        customerResponse.setCardType(paymentRequest.getCardType());
        customerResponse.setAmount(paymentRequest.getAmount());
        customerResponse.setTransactionStatus(false);
        return customerResponse;
    }
}
