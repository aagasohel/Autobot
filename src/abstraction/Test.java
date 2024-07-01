package abstraction;

public abstract class Test {//abstract class
	
	Test(){
		System.out.println("user defined constructor");
	}
	
	static void multiplication() {
		System.out.println("This is multiplication method");
	}
	
	abstract void division();
	
}
