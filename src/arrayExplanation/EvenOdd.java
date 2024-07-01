package arrayExplanation;

public class EvenOdd {

	public static void main(String[] args) {
		int[] a = {1,5,3,8,6,7};
		
		for(int i=0;i<a.length;i++) {
			if(a[i] %2 != 0) {
				System.out.println("odd number ="+ a[i]);
			}
			else {
				System.out.println("even number ="+ a[i]);
			}
		}
	}
}
