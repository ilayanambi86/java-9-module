package com.gateway.mapper;

import com.gateway.request.GatewayRequest;
import com.payment.enums.CardType;
import com.payment.request.PaymentRequest;

public class GatewayRequestToPaymentRequestMapper {
    public static PaymentRequest map(final GatewayRequest gatewayRequest) {
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setAmount(gatewayRequest.getAmount());
        paymentRequest.setCardType(CardType.getCardType(gatewayRequest.getCardType().name()));
        paymentRequest.setCardNumber(gatewayRequest.getCardNumber());

        return paymentRequest;
    }
}
