package collectionExplanation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(23);
		al.add(true);
		al.add(3.14);
		al.add('@');
		al.add(false);
		
		System.out.println(al);
		
		Iterator it =al.iterator();
		
		while(it.hasNext()) {
			Object obj =it.next();
			System.out.println(obj);
		}
		it.remove();
		
		System.out.println(al);
		
		ListIterator li = al.listIterator();
		
		while(li.hasPrevious()) {
			Object obj = li.previous();
			System.out.println(obj);
		}
		

	}

}
