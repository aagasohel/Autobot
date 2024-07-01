package methods;

public class Calculation {
	
	int add() {
		System.out.println("A method starts");
		int a = 10;
		int b = 20;
		int res  = a+b ;
		return res;
	}
		
	void sub() {
		int a = 100;
		int b = 50;
		int res = a-b ;
		System.out.println("subtraction ="+ res);
	}
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		int addition = cal.add();
		System.out.println("Addition of two numbers ="+ addition);
		cal.sub();
		
	}

}
