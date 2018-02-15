module service.ordering {
    requires service.paymentgateway.api;
    requires service.notification;

    uses com.gateway.api.GatewayProcessor;
}