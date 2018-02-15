package com.gateway.api;

import com.gateway.request.GatewayRequest;

public interface GatewayProcessor {
    boolean processPayment(final GatewayRequest gatewayRequest);
}
