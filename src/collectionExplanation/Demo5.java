package collectionExplanation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Demo5 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();//Hetro
		
//		HashSet<double> hs2 = new HashSet<double>();
//		
//		Set hs3 = new HashSet();
		
		hs.add(33);
		hs.add("Java");
		hs.add(3.14);
		hs.add(null);
		hs.add(true);
		hs.add('$');
		hs.add(null);
		hs.add(null);
		hs.add("Java");
		
		System.out.println(hs);
		 hs.remove(null);
		 System.out.println(hs);
		
		 //How to fetch data from Set-->1. for each loop
		 for(Object obj:hs) {
			 System.out.println(obj);
		 }
		 System.out.println("-----------------------------------------");
		 
		 //How to fetch data from Set-->1. while loop(iterator)
		 Iterator it = hs.iterator();
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 System.out.println("-------------------------");
		 ArrayList al = new ArrayList();
		 al.addAll(hs);
		 System.out.println(al);
		 
		 for(int i=0;i<al.size();i++)
		 {
			 System.out.println(al.get(i));
	 }
		 
	}

}
