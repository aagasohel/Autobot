 package myLoops;

public class PrimeNumber {

	public static void main(String[] args) {//2,3,5,7,11,13,17,19,23,29
		int no = 4;						//prime number is either divisible by 1 or itself
		int flag = 0;
		
		for(int i=2; i< no; i++)
		{
			if(no%i== 0)
			{
				flag++;
			}
		}
		if(flag>0) {
			System.out.println("number is not a Prime ="+ no);
		}
		else
		{
			System.out.println("Number is a prime ="+ no);
		}
	}

}
