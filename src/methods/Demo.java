package methods;

public class Demo {
	static int x =40;// static/class variables can be called directly in static and non static methods
	int y = 30;//instance/non static variables can be used directly in non static methods but 
	              //to use in static method we need to create an object of class
	void add() {
		int a = 10;//local variables cannot be accessible outside the declared method,constructor or block
		int b = 20;
		int res  = x+y ;
		int res2 = a+b;
		System.out.println("Addition ="+ res);
		System.out.println("Addition ="+ res2);
	}
	void sub() {
		int a = 100;
		int b = 50;
		int res = a-b ;
		System.out.println("subtraction ="+ res);
	}
	static void mul() {
		int a = 5;
		int b = 7;
		Demo de = new Demo();
		int res = x*(de.y);
		int res2 = a*b;
		System.out.println("Multiplication ="+ res);
		System.out.println("Multiplication ="+ res2);
	}
	public static void main(String[] args) {
		mul();

		Demo obj = new Demo();
		obj.add();
		obj.sub();

	}

}
