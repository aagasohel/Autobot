package collectionExplanation;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10.00);
		al.add(true);
		al.add(55);
		al.add("Hello");
		
		System.out.println("Size of Arraylist ="+ al.size());
		System.out.println("Is Hello present inside al ="+ al.contains("Hello"));
		System.out.println(al);
		
		al.remove("Hello");
		al.clear();
		System.out.println(al);
		System.out.println("Is Hello present inside al ="+ al.contains("Hello"));
		
		
		HashSet hs = new HashSet();
		hs.addAll(al);
		System.out.println("Size of HashSet ="+ hs.size());
		System.out.println("Is Hashset Empty ="+ hs.isEmpty());
		System.out.println(hs);
		hs.removeAll(al);
		System.out.println(hs);
		System.out.println("Is HashSet Empty ="+ hs.isEmpty());
		

	}

}
