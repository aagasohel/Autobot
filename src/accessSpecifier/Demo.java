package accessSpecifier;

public class Demo {
	private int a = 10;
	private void getData() {//only within the class
		System.out.println("This is get Data method");
	}
	void putData() {//within package only
		System.out.println("This is put Data method");
	}
	public void display() { //anywhere inside the class
		System.out.println("This is display method");
	}
	protected void myTest() {// within package, can be accessible outside the package in a specific class
								//condition is inheritance
		System.out.println("This is myTest method");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.getData();
		obj.putData();
		System.out.println(obj.a);
		obj.display();
		obj.myTest();
	}
}
