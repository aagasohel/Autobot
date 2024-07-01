package interFace;

public class Bye implements Hello,Demo {//implementation class--- Multiple Inheritance

	@Override
	public void myData() {
		System.out.println("myData -1");	
	}

	@Override
	public void myData2() {
		System.out.println("myData -2");
	}

	@Override
	public void myData3() {
		System.out.println("myData -3");
	}

	@Override
	public void myData4() {
		System.out.println("myData -4");	
	}

	@Override
	public void display() {
		System.out.println("Display method");	
	}
	public static void main(String[] args) {
		Bye obj = new Bye();
		obj.myData();
		obj.myData2();
		obj.myData3();
		obj.myData4();
		obj.display();
	}

}
