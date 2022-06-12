package java8.interfaces;

public class Paytm implements Payment{
	
	@Override
    public void doTransaction() {
        System.out.println("Paytm transaction");
    }

}
