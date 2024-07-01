package JavabasicsAK;

public class LargestNumber4 {

	public static void main(String[] args) {
		int a = 45;
		int b = 35;
		int c = 23;
		int d = 45;
		
		if(a>=b && a>=c && a>=d)
		{
			System.out.println("a is greater ="+ a);
		}
		else if(b>=a && b>=c && b>=d)
		{
			System.out.println("b is greater ="+ b);
		}
		else if(c>=a && c>=b && c>=d)
		{
			System.out.println("c is greater ="+ c);
		}
		else if(d>=a && d>=b && d>=c)
		{
			System.out.println("d is greater ="+ d);
		}
	}

}
