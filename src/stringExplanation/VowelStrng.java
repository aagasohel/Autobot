package stringExplanation;
public class VowelStrng {

	public static void main(String[] args) {
		String s = "Nashik";
		String lower = s.toLowerCase();
		char c;
		int count = 0;
		
		for(int i=0;i<lower.length();i++) {
			c = lower.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' ||c=='o' ||c=='u') {
				System.out.println("Vowel found ="+ c);
				count++;
			}
		}
		System.out.println("Number of Vowels =" + count);
	}
}
