package arrayExplanation;
public class SmallestNumber {

	public static void main(String[] args) {
		int[] a = {45,23,12,89,49,78};
		int min = a[0];
		
		for(int i=1;i<a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Smallest number ="+ min);
	}
}
