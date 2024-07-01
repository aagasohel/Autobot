package stringExplanation;
public class PalindromeStng {

	public static void main(String[] args) {
		//When we reverse a string it remains as it is that is called palindrome String
		String s="Nitin";
		String rev ="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+ s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("String is Palindrome ="+ rev);
		}
		else {
			System.out.println("String is not Palindrome ="+ rev);
		}
	}
}
