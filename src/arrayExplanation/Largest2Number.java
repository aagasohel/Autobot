package arrayExplanation;
public class Largest2Number {
	public static void main(String[] args) {
		int[] a = {15,7,3,43,24,57,89};
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				max = a[i];
				a[i]= a[j];
				a[j]= max;
			}
		}
		System.out.println("2nd largest number ="+ max);
	}
}
