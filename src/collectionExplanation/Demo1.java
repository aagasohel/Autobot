package collectionExplanation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		List al = new ArrayList();
		
		al.add(127);
		al.add('@');
		al.add(3.14f);
		al.add(false);
		al.add(55.75);
		al.add("Hello");
		al.add("Hello");//list also maintains insertion order
		al.add(null);//list can accept multiple null values, it allows duplicate value
		al.add(null);
		al.add(null);
		al.add(2, "Arraylist");
		al.add(2, true);
		
		System.out.println(al);
		
		System.out.println("----------------------------------------------");
		
		Set hs = new HashSet();
		
		hs.add(127);//set does not maintain insertion order
		hs.add('@');//it accepts only single null value
		hs.add(3.14f);//it does not allow duplicate value
		hs.add(false);
		hs.add(55.75);
		hs.add("Hello");
		hs.add("Hello");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		
		

	}

}
