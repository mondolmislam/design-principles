public class PaymentProcess {
    private PaymentHandler firstHandler;

    public PaymentProcess() {
        // Create the chain of handlers
        CreditCardPaymentHandler creditCardHandler = new CreditCardPaymentHandler();
        BankPaymentHandler bankTransferHandler = new BankPaymentHandler();
        PaypalPaymentHandler payPalHandler = new PaypalPaymentHandler();
        EwalletsPaymentHandler eWalletHandler = new EwalletsPaymentHandler();

        creditCardHandler.setSuccessor(bankTransferHandler);
        bankTransferHandler.setSuccessor(payPalHandler);
        payPalHandler.setSuccessor(eWalletHandler);

        firstHandler = creditCardHandler;
    }

    public boolean processPayment(Payment payment) {
        return firstHandler.canHandlePayment(payment);
    }
}
