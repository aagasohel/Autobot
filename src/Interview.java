
public class Interview {
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interview m = new Interview();//every time object is created using new keyword the memory is allocated to object
		m.a=30;
		m.b=40;
		
		Interview n = new Interview();
		n.a=50;
		n.b=60;
		
		Interview o = new Interview();
		o.a=70;
		o.b=80;//for static variable memory allocated only once at the time of compilation
		
		System.out.println(m.a);//30
		System.out.println(m.b);//80
		System.out.println(n.a);//50
		System.out.println(n.b);//80
		System.out.println(o.a);//70
		System.out.println(o.b);//80
		
		

	}

}
