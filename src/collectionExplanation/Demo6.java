package collectionExplanation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo6 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
	     
	    hm.put(101, "Rahul");//
	    hm.put(102, "Tina");
	    hm.put(103, "John");
	    hm.put(104, "Maria");
	    hm.put(102, "Jennifer");
	    hm.put(105, "Rahul");
	    hm.put(null, "Ajay");
	    hm.put(null, "Sachin");
	    
	    System.out.println(hm);
	    
	   int sizeofHm = hm.size();
	   System.out.println("Size of HashMap ="+ sizeofHm);
	   
	   System.out.println("Contains Key ="+ hm.containsKey(107));
	   
	   System.out.println("Contains Value ="+ hm.containsValue("John"));
	   
	   System.out.println("Value of Get ="+ hm.get(102));
	   
	   Set s = hm.keySet();
	   System.out.println(s);
	   for(Object objKey:s) {
		   System.out.println(objKey+" "+hm.get(objKey));
	   }
	   Collection c = hm.values();
	   System.out.println(c);
	   Set allentries = hm.entrySet();	
	   for(Object obj:allentries) {
		   System.out.println(obj);
	   }
	}

	
     
     
     
     
     
     
}
