package abstraction;

public class Demo {
	int a = 20;
	int b = 10;
	int res;
	
	Demo(String name,int empid){
		System.out.println("Name ="+ name +" "+"EmployeeId ="+ empid);
	}
	Demo(int x)
	{
		System.out.println("single parameter constructor");
	}
	
	void addition() {
		res = a+b;
		System.out.println("addition= "+res);
	}
	void subtraction() {
		res = a-b;
		System.out.println("subtraction = "+ res);
	}
	
	void multiplication() {
		System.out.println("Multiplication method");
	}
	public static void main(String[] args) {
		Demo obj = new Demo("Sohel",101);
		Demo obj2=new Demo("Mohsin",102);
		Demo obj3=new Demo("Megha",103);
		obj.addition();
		obj.subtraction();
	}

}
