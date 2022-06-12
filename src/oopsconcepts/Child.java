package oopsconcepts;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		
		p.m1();
		p.m2();
		try {
		c.m1();
		}
		catch(Exception e) {
			
		}
		c.m2();
		
		System.out.println("---");
		Parent p1 = new Child();
		//Child methods get call as we have object of child
		p1.m1();
		p1.m2();
		
		// Since it is parent refrence and parent dont have m3 it is compile time error
//		p1.m3();
		
		//CE Error
//		Child c1 =new Parent();
	}
	
	public int m2() {
		super.m2();
		System.out.println("Child m2");
		return 0;
		
	}
	
	public void m1() {
		System.out.println("Child m1");
		
	}
	
	public void m3() {
		System.out.println("Child m3");
		
	}

}
