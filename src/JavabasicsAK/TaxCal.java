package JavabasicsAK;

public class TaxCal {

	public static void main(String[] args) {
		int ctc = 1100000;
		
		if(ctc<250000)
		{
			System.out.println("No tax is applicable ");
		}
		else if (ctc>=250000 && ctc<500000)
		{
			System.out.println("5% tax is applicable ="+ ctc);
		}
		else if(ctc>=500000 && ctc<750000)
		{
			System.out.println("15% tax applicable ="+ ctc);
		}
		else if(ctc>=750000 && ctc<1000000)
		{
			System.out.println("20% tax applicable ="+ ctc);
		}
		else
		{
			System.out.println("30% tax appl ="+ ctc);
		}
	}

}
