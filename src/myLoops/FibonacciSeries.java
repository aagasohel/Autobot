package myLoops;

public class FibonacciSeries {

	public static void main(String[] args) {//0 1 1 2 3 5 8 13
		int a= 0;						 //   a b
		int b= 1;							//  a b
		int c= 0;
		
		System.out.print(a);
		System.out.print(" "+b);
		
		for(int i=1; i<=6;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}


