package stringExplanation;
public class StringMethods1 {

	public static void main(String[] args) {
		String s1 = new String("Mumbai");
		
		char c = s1.charAt(2);
		System.out.println(c);
		
		String s2 = s1.concat("-City");
		System.out.println(s2);
		
		boolean eqres = s1.equals("Mumbai");
		System.out.println(eqres);
		
		boolean eqigcsres = s1.equalsIgnoreCase("mumbai");
		System.out.println("Equal Ignore Case result ="+eqigcsres);
		
		boolean startswithres = s2.startsWith("Mum");
		System.out.println("StartWithRes ="+startswithres);
		
		boolean containsres = s2.contains("bai");
		System.out.println("contains result ="+containsres );
		
		boolean endswithres =s2.endsWith("it");
		System.out.println("EndsWith result ="+ endswithres);
		
		char mychar ='b';
		int index = s1.indexOf(mychar);
		System.out.println("Index of "+mychar+"="+index);
		
		System.out.println(s2.lastIndexOf('i'));
		
		int strlen = s1.length();
		System.out.println("Length of String = "+strlen);
		
		String replaceRes = s2.replace('a', '@');
		System.out.println("Replaced character ="+replaceRes);
		
		String replaceRes1 =s2.replace("Mumbai", "Pune");
		System.out.println("Replaced String ="+ replaceRes1);
		
		String replaceRes2 =s2.replaceFirst("i", "!");
		System.out.println("Replaced character ="+replaceRes2);
		
		String s3 = "How are you";
		String[] strarr = s3.split(" ");
		for(int i=0;i<strarr.length;i++) {
			System.out.println(strarr[i]);
		}
		System.out.println("----------------------------------------");
		for(String data:strarr) {
			System.out.println(data);
		}
		
		String substrngRes = s2.substring(3);
		System.out.println("Substring res ="+substrngRes);
		
		String substrngRes1 = s2.substring(3, 9);
		System.out.println("Substring res ="+substrngRes1);
		
		char[] allchar = s2.toCharArray();
		for(int i=0;i<s2.length();i++) {
			System.out.print(allchar[i] +" ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		for(char data:allchar ) {
			System.out.print(data+ " ");
		}
		System.out.println();
		
		String lowercaseRes = s2.toLowerCase();
		System.out.println("Lowercase Result ="+lowercaseRes);
		
		String uppercaseRes = s2.toUpperCase();
		System.out.println("Uppercase Result ="+uppercaseRes);
		
		String s4 =" Hello, How are you doing today";
		System.out.println(s4);
		
		String trimRes =s4.trim();
		System.out.println(trimRes);
	}
}
