package collectionExplanation;

import java.util.ArrayList;
import java.util.Collections;

public class Prog1 {

	public static void main(String[] args) {
		int[] a = {23,44,61,67,78,21,32,89,92,96};
		int no;
		
		ArrayList evenNo = new ArrayList();
		ArrayList oddno = new ArrayList();
		
		for(int i=0; i<a.length; i++) {
			no = a[i];
			if(no%2 == 0) {
				evenNo.add(a[i]);
			}
			else {
				oddno.add(a[i]);
			}
			
		}
		System.out.println("Even Numbers ="+ evenNo);
		System.out.println("Odd Numbers ="+ oddno);
		
		Collections.sort(evenNo);
		System.out.println("Even Numbers ="+ evenNo);
		
		Collections.sort(oddno, Collections.reverseOrder());
		System.out.println("Odd Numbers ="+ oddno);
		

	}

}
