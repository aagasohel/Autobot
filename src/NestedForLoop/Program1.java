package NestedForLoop;

import accessSpecifier.Demo;

public class Program1 extends Demo {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=6; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		Program1 obj = new Program1();
		obj.myTest();
	}

}
