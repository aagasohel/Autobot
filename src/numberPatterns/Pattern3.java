package numberPatterns;
public class Pattern3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			//spaces
			for(int j=5; j>i; j--)
			{
				System.out.print(j);
			}
		//stars
		for(int k=1; k<=i; k++)
		{
			System.out.print(k);
		}
		System.out.println();
		}
	}
}


