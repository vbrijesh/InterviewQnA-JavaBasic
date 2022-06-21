package threadexamples;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddNumber {
	
	private static Object object= new Object();
	
	private static IntPredicate evencon=e->e%2==0;
	private static IntPredicate oddcon=e->e%2!=0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		CompletableFuture.runAsync(()->EvenOddNumber.printNumber(evencon));
		CompletableFuture.runAsync(()->EvenOddNumber.printNumber(oddcon));
		Thread.sleep(1000);

	}
	
	public static void printNumber(IntPredicate condition) {
		IntStream.rangeClosed(1, 10).filter(condition).forEach(EvenOddNumber::execute);
	}
	
	public static void execute(int n) {
		synchronized (object) {
			try {
				System.out.println(Thread.currentThread().getName()+ ":" +n);
				object.notify();
				object.wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
