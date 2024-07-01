package methods;

public class MethodOverloading{

	public static void main(String[] args) {
		 MethodOverloading obj = new  MethodOverloading();
		 obj.addition();
		 obj.addition(35,24);
		 obj.addition(20.3, 23.2);
		
	}
	void addition() {//declaring multiple methods in same class with same name but having different 
		             // parameters or arguments is called as method overloading
		int a = 10;
		int b = 20;
		int res = a+b;
		System.out.println(res);
	}
	void addition(int no1, int no2) {
		int a = no1;
		int b = no2;
		int res = a+b;
		System.out.println(res);
	}
	void addition(double a, double b) {
		double res = a+b;
		System.out.println(res);
	}

}
