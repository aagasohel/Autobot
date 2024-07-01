package NestedForLoop;
public class Pattern8 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			//spaces
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			//star
			for(int k=1; k<=i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			//space
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			//star
			for(int k=4; k>=i; k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
