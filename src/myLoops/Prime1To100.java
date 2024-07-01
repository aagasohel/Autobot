package myLoops;

public class Prime1To100 {

	public static void main(String[] args) {
		
		int no;
		
		for( no=1; no<=100;no++)
		{
			int flag =0;
			for(int i=2; i<no;i++)
			{
				if(no%i==0)
				{
					flag++;
				}
			}
			if(flag==0)
			{
				System.out.print(" "+no);
			}
			
		}
		
		
	}

}
