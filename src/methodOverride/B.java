package methodOverride;

public class B extends A {//1.Method overriding always takes place between two classes
	//2.inheritance is must 3.superclass and subclass method should be non static 
	//4.in method overriding declaration is same but body/ definition is different
	//5.If superclass and subclass method is static then superclass method will be hidden under subclass method and 
	  //subclass method will be called this is called method hiding
	int x = 100;
	int y = 5;
	int result;
	
	void multiplication() {
		result = x*y;
		System.out.println("Multiplication result = " +result);
	}
	void addition() {//Super keyword cannot be used in static context
	    result = x+y;
		System.out.println("addition result = " +result);
		super.division();
	}
	static void division() {
		System.out.println("Division method from class B");
	}
	static void test() {
		System.out.println("Test from class B");
	}
	public static void main(String[] args) {
		B bobj = new B();
		bobj.addition();
	    division();
		A aobj = new A();
		aobj.addition();
		bobj.multiplication();
		bobj.subtraction();
		
		
		
		
		B.test();
		
	}

}
