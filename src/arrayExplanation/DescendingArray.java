package arrayExplanation;
public class DescendingArray {

	public static void main(String[] args) {
		int[] a = {15,2,7,81,33,86,28,43};
		int swap;
		System.out.println("Array in Descending order");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
				swap = a[i];
				a[i] = a[j];
				a[j] = swap;
				}
				}
			System.out.print(a[i]+" ");
		}
	}
}
