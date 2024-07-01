package myLoops;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {2,4,6,10};
		int sum1 =0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of all the array elements:" + sum1);
		
		int sum2=0;
		
		for(int i=2;i<=10;i=i+2)
		{
			sum2= sum2 + i;
		}
		System.out.println("sum of the range of elements in array:" +sum2);
		System.out.println("Missing number is:" + (sum2-sum1));
	}
}
