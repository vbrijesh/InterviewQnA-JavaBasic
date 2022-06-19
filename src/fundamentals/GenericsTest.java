package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void onlySpecified(ArrayList<String> s) {
		s.add("");
		s.add(null);
//		s.add(10); CT error
	}

	// We can add only null but can call by passing any type
	// This type of method is best suitable for read only operation
	public static void anyType(ArrayList<?> s) {
//		s.add("");CT error
		s.add(null);
//		s.add(10); CT error
	}

	/*
	 * we can call by passing either T or extends(child) class If T is an interface
	 * we can call this by passing T or its implementation classes
	 */
	public static <T> void extendType(ArrayList<? extends T> s) {
		/**
		 * with in this method we can pass T or its child/implementation class, that we
		 * dont know which class comes, so we can add only null. This also best suitable
		 * for read only
		 */
//		s.add("");//CT error
		s.add(null);
//		s.add(10); CT error
	}

	/*
	 * we can call by passing either T or extends(child) class If T is an interface
	 * we can call this by passing T or its implementation classes
	 */
	public static <T> void superType(ArrayList<? super T> s) {
		/**
		 * with in this method we can pass T or its super class or implementation super
		 * classes of T, we can add T type of objects and null
		 */
//		s.add(""); if T is object it will work
		s.add(null);
//		s.add(10); //if T is object it will work 
	}

	public static <T> void test() {
	}

	public static <T extends Number> void test1() {
	}

	public static <T extends Number & Runnable> void test2() {
	}

	public static <T extends Comparable & Runnable> void test3() {
	}

	public static <T extends Number & Comparable & Runnable> void test4() {
	}

	// CT Error Always class First then interface
//	public static <T extends Runnable & Number > void test5() {}  

	// We can not extends more than one class
//	public static <T extends String & Number > void test5() {}

	// add in generic object
	public static void add(ArrayList al) {
		al.add(10);
	}

	// add in generic object not allowed if we define type
//		public static void add(ArrayList<String> al) {
//			al.add(10);		
//		}

	/**
	 * Can not define two methods with same name
	 * 
	 * @param i
	 */
	public void ma(ArrayList<Integer> i) {
	}

//	   public void ma(ArrayList<String> i) {}//Error same method name

	public static void main(String... g) {
		// We can call this method by passing specified type
		onlySpecified(new ArrayList<String>());
		
		anyType(new ArrayList<Animal>());
		anyType(new ArrayList<Integer>());
		anyType(new ArrayList<Number>());
		anyType(new ArrayList<Cat>());
		
		extendType(new ArrayList<Animal>());
		extendType(new ArrayList<Cat>());
		extendType(null);
		
		superType(new ArrayList<Animal>());
		superType(null);

		List<String> l1 = new ArrayList<String>();
		List<?> l2 = new ArrayList<String>();
		List<?> l3 = new ArrayList<Integer>();
		List<? extends Number> l4 = new ArrayList<Integer>();
//		List<? extends Number> l5 = new ArrayList<String>(); //CT Error
		List<? extends Object> l6 = new ArrayList<String>();
//		List<? super Object> l7 = new ArrayList<String>(); //CT Error
		List<? super String> l8 = new ArrayList<Object>();

		// Generic refrence
		ArrayList<String> al1 = new ArrayList<>();
		// Non generic refrence
		ArrayList al2 = new ArrayList<String>();

		ArrayList<String> al = new ArrayList<String>();
		al.add(null);
		al.add("");
		al.add("test");
//		al.add(10); //CT Error
		// add is non generic method
		add(al);

		System.out.println(al); // [null, , test, 10]
	}

//	class D<T super Number>{} // Error
	class DD<T extends Number> {
	}

	class Animal {
	}

	class Cat extends Animal {
	}

	class RedCat extends Cat {
	}

	class BlueCat extends Cat {
	}

	class BlueBlueCat extends BlueCat {
	}

	class Dog extends Animal {
	}

//	class D<T super Number>{} // Error

}
