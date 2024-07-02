public abstract class PaymentHandler {
    protected PaymentHandler successor;

    public void setSuccessor(PaymentHandler successor){
        this.successor=successor;
    }

    protected abstract boolean canHandlePayment(Payment payment);
}
