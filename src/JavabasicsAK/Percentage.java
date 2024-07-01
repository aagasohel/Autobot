package JavabasicsAK;

public class Percentage {

	public static void main(String[] args) {
		double percent = 32.33;
		
		if(percent>75)
		{
			System.out.println("dist ="+ percent);
		}
		else if(percent>=60 && percent<75)
		{
			System.out.println("first class ="+ percent);
		}
		else if(percent>=50 && percent<60)
		{
			System.out.println("second class ="+ percent);
		}
		else if(percent>=35 && percent<50)
		{
			System.out.println("Just passed ="+ percent);
		}
		else
		{
			System.out.println("failed ="+ percent);
		}

	}

}
