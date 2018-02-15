package com.gateway.processor;

import com.gateway.api.GatewayProcessor;
import com.gateway.mapper.GatewayRequestToPaymentRequestMapper;
import com.gateway.request.GatewayRequest;
import com.payment.request.PaymentRequest;
import com.payment.response.CustomerResponse;

public class PaymentGatewayProcessor implements GatewayProcessor {
    private ExternalBankProcessor processor = new ExternalBankProcessor();

    @Override
    public boolean processPayment(final GatewayRequest gatewayRequest) {
        return processor.processPaymentWithExternalBank(GatewayRequestToPaymentRequestMapper.map(gatewayRequest));
    }
}
