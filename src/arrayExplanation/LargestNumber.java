package arrayExplanation;
public class LargestNumber {

	public static void main(String[] args) {
		int[] a = {45,23,12,89,49,78};
		int max = a[0];
		
		for(int i=1;i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Largest number ="+ max);
	}
}
