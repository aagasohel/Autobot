package inheritance;

public class C extends B {//multi level inheritance
	double p = 5;
	double q = 2;
	double res;
	
	void division() {
		res = p/q;
		System.out.println("Division Result = " +res);
	}
	public static void main(String[] args) {
		C cobj = new C();
		cobj.addition();
		cobj.multiplication();
		cobj.division();
		subtraction();
		System.out.println(cobj.no1);
		System.out.println(cobj.x);
		System.out.println(cobj.p);
		System.out.println(cobj.q);
		System.out.println(cobj.no1);
		
		
	}

}
