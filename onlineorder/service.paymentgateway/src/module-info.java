module service.paymentgateway {

    requires service.paymentgateway.api;
    requires service.acquirerbank.api;

    uses com.payment.api.PaymentProcessor;

    provides com.gateway.api.GatewayProcessor with com.gateway.processor.PaymentGatewayProcessor;
}