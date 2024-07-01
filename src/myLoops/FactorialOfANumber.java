package myLoops;

public class FactorialOfANumber {

	public static void main(String[] args) {
		int no =5;
		int fact =1;
		
		for(int i= no; i>0; i--)
		{
			fact = fact*i;
			System.out.println(fact);
		}
		System.out.println("Factorial of a number ="+ fact);
	}
}
