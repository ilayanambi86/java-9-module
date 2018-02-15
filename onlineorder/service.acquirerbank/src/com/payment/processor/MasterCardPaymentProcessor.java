package com.payment.processor;

import com.payment.request.PaymentRequest;
import com.payment.response.CustomerResponse;

public class MasterCardPaymentProcessor implements Card {
    private static double balance = 20.0;

    @Override
    public CustomerResponse processPayment(final PaymentRequest paymentRequest) {
        System.out.println("AcquirerBank: Processing payment request for Master card " + paymentRequest.getCardNumber());

        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setFname("Ilayanambi");
        customerResponse.setLname("Ponramu");
        customerResponse.setCardType(paymentRequest.getCardType());
        customerResponse.setAmount(paymentRequest.getAmount());

        if (paymentRequest.getAmount() > balance) {
            customerResponse.setTransactionStatus(false);
        } else {
            customerResponse.setTransactionStatus(true);
        }

        return customerResponse;
    }
}
