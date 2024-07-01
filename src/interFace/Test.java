package interFace;

public class Test implements Demo{
	int res;
	int x =10;
	
	@Override
	public void myData() {
		res = a+b;	
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
	public static void main(String[] args) {
		Test obj = new Test();
		obj.myData();
		obj.myData2();
		obj.myData3();
		obj.myData4();
		System.out.println(Demo.a);
		
		int x=10;
		System.out.println(x);
		x++;
		System.out.println(x);
		
		final int y =15;
		System.out.println(y);
		
	}
	

}
