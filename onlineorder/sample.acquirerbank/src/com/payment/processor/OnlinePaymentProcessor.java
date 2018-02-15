package com.payment.processor;

import com.payment.response.CustomerResponse;
import com.payment.enums.CardType;
import com.payment.api.PaymentProcessor;
import com.payment.request.PaymentRequest;

public class OnlinePaymentProcessor implements PaymentProcessor {
    private Card visaCardPaymentProcessor = new VISACardPaymentProcessor();
    private Card masterCardPaymentProcessor = new MasterCardPaymentProcessor();

    @Override
    public CustomerResponse processPayment(final String cardNumber, final String cardType, final double amount) {
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setCardNumber(cardNumber);
        paymentRequest.setCardType(CardType.getCardType(cardType));
        paymentRequest.setAmount(amount);

        CustomerResponse customerResponse = new CustomerResponse();
        if (paymentRequest.getCardType().equals(CardType.VISA)) {
            customerResponse = visaCardPaymentProcessor.processPayment(paymentRequest);
        } else if (paymentRequest.getCardType().equals(CardType.MASTER)) {
            customerResponse = masterCardPaymentProcessor.processPayment(paymentRequest);
        }
        return customerResponse;
    }
}
