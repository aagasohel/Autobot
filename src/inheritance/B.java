package inheritance;

public class B extends A{//single level inheritance
	int x = 100;
	int y = 5;
	int result;
	
	void multiplication() {
		result = x*y;
		System.out.println("Multiplication result = " +result);
	}
	
	public static void main(String[] args) {
		B obj = new B();//create an object of subclass
		obj.addition();
		subtraction();
		obj.multiplication();
		System.out.println(obj.no1);
		System.out.println(obj.no2);
		System.out.println(obj.x);
		System.out.println(obj.y);
	}

}
