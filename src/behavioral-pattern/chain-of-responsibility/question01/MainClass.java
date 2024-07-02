public class MainClass {
    public static void main(String[] args) {
        PaymentProcess processor = new PaymentProcess();
        Payment payment = new Payment(PaymentType.CREDIT_CARD, 100);
        boolean success = processor.processPayment(payment);
        if(success) {
            System.out.println("Payment processed successfully");
        } else

        {
            System.out.println("Payment processing failed");
        }
    }
}
