package arrayExplanation;
public class SumofArray {

	public static void main(String[] args) {
		
		int[] a = {1,5,3,8,6,7};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum of Array ="+ sum);
		System.out.println("count ="+ a.length);
	}
}
