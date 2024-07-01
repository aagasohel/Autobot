package thisKeyword;

public class Test extends Demo {
     
	
	int a;
	int b;
	Test(int a, int b) {
		super(a,b);
	}
	

	void add() {
		int res = a+b;
		System.out.println("Addition ="+res);
	}
	void subtraction() {
		int res = super.a - super.b;
		System.out.println(super.a);
		System.out.println(this.a);
		this.multiplication();
		super.multiplication();
		System.out.println(res);
	}
	void multiplication() {
		  int res = a*b;
		  System.out.println("Multiplication ="+ res);
	  }
	void addAndSubtract() {
		this.add();
		int res = a-b;
		System.out.println("Subtraction ="+ res);
	}
	public static void main(String[] args) {
		
		Test obj = new Test(10,20);
		obj.add();
		
		Test obj2 = new Test(30,70);
		obj2.add();
		obj2.addAndSubtract();
		
	}
}
