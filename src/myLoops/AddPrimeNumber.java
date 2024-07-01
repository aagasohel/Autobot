package myLoops;

public class AddPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={2,3,5,7,11};         // all the prime numbers are divisible by itself and 1
		int add = 0;
		for(int i=0; i<a.length;i++)
		{
		add = add + a[i];
		}
		System.out.println(add);// output= 28

	}

}
