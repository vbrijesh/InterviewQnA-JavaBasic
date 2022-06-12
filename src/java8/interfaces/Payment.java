package java8.interfaces;

import java.util.Date;

public interface Payment {
	
	public void doTransaction();
	
	/**
     * ignore if you don't want to add any addCoupon features in any of your impl
     * directly access from super class , if you want to use same impl
     * @Override addCoupon method if you want to provide different impl
     * **/
	default void addCoupon() {
		System.out.println("5 rs cashbakc");
	}
	
	static void generateTransaction() {
		System.out.println("transaction: " +new Date().getTime());
	}
}
