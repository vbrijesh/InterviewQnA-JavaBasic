package java8.interfaces;

public class GooglePay implements Payment {
    @Override
    public void doTransaction() {
        System.out.println("GPay transaction");
    }



    public static void main(String[] args) {
        Payment payment=new GooglePay();
        payment.addCoupon();
    }
}
