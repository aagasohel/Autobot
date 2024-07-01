package stringExplanation;
public class StrngRev2 {

	public static void main(String[] args) {
		String s = "Never give up";
		String[] word = s.split(" ");
		System.out.println(word[0]);
		String strRev = "";
		
		for(String eachword:word) {
			String revWord = "";
			for(int i=eachword.length()-1;i>=0;i--) {
				revWord = revWord + eachword.charAt(i);
			}
			strRev = strRev + revWord + " ";
		}
		System.out.println("Reverse of a String ="+ strRev);
	}
}
