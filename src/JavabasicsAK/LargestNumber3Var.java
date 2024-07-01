package JavabasicsAK;

public class LargestNumber3Var {

	public static void main(String[] args) {
		int a =30;
		int b = 35;
		int c =50;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is the largest number");
			}
			else
			{
				System.out.println("c is the largest number");
			}	
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is the largest number");
			}
			else
			{
				System.out.println("c is the largest number");
			}
		}
		

	}

}
