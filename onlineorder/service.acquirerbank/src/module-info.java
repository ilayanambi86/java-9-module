module service.acquirerbank {
    requires service.acquirerbank.api;

    provides com.payment.api.PaymentProcessor with com.payment.processor.OnlinePaymentProcessor;
}