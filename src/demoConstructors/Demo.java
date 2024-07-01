package demoConstructors;

public class Demo {
	int rollno;
	String name;
	static boolean flag;
	char data;
	
    Demo(){//constructor name is same as its class name, initialize data members declared in same class
    	//load non static elements into object or instance, no explicit return type
	    int a =10;
		System.out.println(a);
		System.out.println(rollno);
		System.out.println(flag);
	}
	void display() {
	    int x =100;
		int y = 200;
		int res = x+y;
		System.out.println(res);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Demo obj = new Demo();//Every time an object is created using new keyword,atleast one constructor is called
		obj.display();
		
		System.out.println("Value of rollno = "+ obj.rollno);
		System.out.println("value of name = "+ obj.name);
		System.out.println("value of flag = "+ flag);
		System.out.println("value of Data = "+ obj.data);			
	}
}
