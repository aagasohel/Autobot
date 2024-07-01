package JavabasicsAK;

public class Leapyear {

	public static void main(String[] args) {
		int year = 2000;//when we divide any year by 4 if it gives remainder as 0 then it is leap year
		if(year%4 == 0)
		{
			System.out.println("Entered year is a leap year="+ year);
		}
		else
		{
			System.out.println("Entered year is not a leap year="+ year);
		}

	}

}
