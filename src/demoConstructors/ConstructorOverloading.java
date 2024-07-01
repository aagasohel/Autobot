package demoConstructors;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a){//declaring multiple constructors in same class with same name as classname 
		//but with different parameter or argument is called constructor overloading
		System.out.println("Constructor no1");	
	}
	ConstructorOverloading(){
		System.out.println("Constructor no2");	
	}
	ConstructorOverloading(int a, int b){
		System.out.println("Constructor no3");	
	}
	void myMethod1() {
		System.out.println("My Method1");
	}
	static void myMethod2() {
		System.out.println("My Method2");
	}
	public static void main(String[] args) {
		myMethod2();
		ConstructorOverloading obj = new ConstructorOverloading(10);
		ConstructorOverloading obj1 = new ConstructorOverloading(10,20);
		ConstructorOverloading obj2 =new ConstructorOverloading();
		obj.myMethod1();
	}

}
