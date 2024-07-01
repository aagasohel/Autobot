package collectionExplanation;

import java.util.Enumeration;
import java.util.Vector;

public class Demo4 {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(23);
		v.add(true);
		v.add(3.14);
		v.add('@');
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}	

	}

}
