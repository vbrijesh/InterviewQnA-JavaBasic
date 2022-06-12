package fundamentals;

public class CallHierarchy extends P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CallHierarchy();
		new P();

	}
	
	{
		System.out.println("child instance block");
	}
	
	static {
		System.out.println("child static block");
	}
	
	private CallHierarchy() {
		System.out.println("child Constructor");
	}
}

class P{
	{
		System.out.println(" Parent instance block");
	}
	
	static {
		System.out.println("Parent static block");
	}
	
	public P() {
		System.out.println("Parent Constructor");
	}
}
