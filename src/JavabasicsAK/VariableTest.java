package JavabasicsAK;

public class VariableTest {

	public static void main(String[] args) {
		//data_Type Variable_name = value;
		
		int x = 100;
		System.out.println(x);//100
		x = 300;
		System.out.println(x);//300 value can be changed during program execution
		
		boolean b1 = true;
		boolean b2 = false;//default value false
		System.out.println(b1);
		System.out.println(b2);
		
		char c1 = 'x';//char datatype contains character, digits(0-9),special symbols
		char c2 = '4';
		char c3 = '$';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		byte by1 = -125;// size 1 byte = 8 bit(2^8=256) range 1 to 256
		byte by2 = 123;
		System.out.println(by1);
		System.out.println(by2);
		
		short s1 =1000;
		System.out.println(s1);
		
		int a =20;
		int b = 30;
		int res = a+b ;
		System.out.println(res);
		
		long l = 2345678;
		System.out.println(l);
		
		float f = 20.587f;
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
		
		String name = "SOHEL";
		System.out.println(name);
	}

}
