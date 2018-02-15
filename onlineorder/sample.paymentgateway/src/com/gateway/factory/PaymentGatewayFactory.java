package com.gateway.factory;

import com.gateway.processor.PaymentGatewayProcessor;
import com.gateway.api.GatewayProcessor;

public class PaymentGatewayFactory {

    private PaymentGatewayFactory() {
    }

    public static GatewayProcessor getGatewayProcessorInstance() {
        return new PaymentGatewayProcessor();
    }
}
