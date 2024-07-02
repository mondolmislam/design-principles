public class EwalletsPaymentHandler extends PaymentHandler{

    @Override
    protected boolean canHandlePayment(Payment payment) {
        if (payment.getType().equals(PaymentType.CREDIT_CARD)){
            return true;
        }
        else if (successor != null) {
            // Pass the request to the next handler
            return successor.canHandlePayment(payment);
        } else {
            return false;
        }
    }
}
