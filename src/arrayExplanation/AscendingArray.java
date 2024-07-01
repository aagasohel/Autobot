package arrayExplanation;

import accessSpecifier.Demo;

public class AscendingArray extends Demo {

	public static void main(String[] args) {
		int[] a = {15,2,7,81,33,86,28,43};// Ascending from s
		int swap;						// small number to large number
		System.out.println("Array in Ascending order");
		System.out.println("length of array: "+ a.length);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				swap = a[i];
				a[i] = a[j];
				a[j] = swap;
				}
				}
			System.out.print(a[i]+" ");
		}
        System.out.println();
        System.out.println("smallest number ="+ a[0]);
        AscendingArray obj = new AscendingArray();
        obj.myTest();
	}
}
