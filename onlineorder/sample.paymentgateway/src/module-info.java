module sample.paymentgateway {
    exports com.gateway.api;
    exports com.gateway.factory;

    requires transitive sample.acquirerbank;
}