package oopsconcepts;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o = new Overloading();
		System.out.println(o.m1());
		System.out.println(o.m2("s2"));
		System.out.println(o.m3());
		System.out.println(o.m4("s4"));

	}
	
	public String m1() {
		return "String m1";
	}
	
	public String m2(String r) {
		return "String m1 plus r:" +r;
	}
	
	public static String m3() {
		return "static m3";
	}
	
	public static String m4(String s) {
		return "static m4 with s: " +s;
	}

}
