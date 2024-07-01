package methodOverride;

public class A {
	int no1 = 10;
	int no2 = 20;
	int res;
	
	void addition() {
	    res = no1 + no2;
		System.out.println("addition result = " +res);
	}
	
	void subtraction() {
		res = no1-no2;
		System.out.println("subtraction result = "+res);	
	}
	static void division() {
		System.out.println("Division method from class A");
	}

}
