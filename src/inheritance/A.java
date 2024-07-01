package inheritance;

public class A {
	int no1 = 10;
	int no2 = 20;
	int res;
	
	void addition() {
		res = no1 + no2;
		System.out.println("addition result = " +res);
	}
	
	static void subtraction() {
		System.out.println("This is subtraction method from classA");
	}

}
