package demoConstructors;

public class VariableTest {
	double pi = 3.14;//we can call instance variable non static method directly but to call it in static method we need to create object
	int r = 5;		//but to call it in static method we need to create object
	static int a = 10;//we can call static variables in both methods directly
	static int b = 20;
	static int res;
	void aoc() {
		double aoc = pi*r*r;
		System.out.println("Area of circle = "+ aoc);
	}
	static void addition() {
		System.out.println("Result = "+ res);
		res = a+b;
		System.out.println("Result  = "+ res);
	}
	static void myTest() {
		int myres = a-b ;
		System.out.println(myres);
		VariableTest ob = new VariableTest();
		System.out.println(ob.r);
	}
    void myTest3() {
		System.out.println(pi);
		System.out.println(a);
	}
	public static void main(String[] args) {
		VariableTest obj = new VariableTest();
		obj.aoc();
		addition();
		myTest();
		obj.myTest3();
		System.out.println(obj.pi);
		System.out.println(obj.r);
		System.out.println(a);
		
	}

}
