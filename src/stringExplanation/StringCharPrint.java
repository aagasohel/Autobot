package stringExplanation;
public class StringCharPrint {

	public static void main(String[] args) {
		String s ="Mumbai";
		for(int i=0;i<s.length();i++) {
			char eachchar = s.charAt(i);
			System.out.print(eachchar+ " ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		String s1 = "Pune";
		char[] chararr = s1.toCharArray();
		System.out.println(chararr);
		for(char eachchar:chararr) {
			System.out.print(eachchar+ " ");
		}
	}
}
