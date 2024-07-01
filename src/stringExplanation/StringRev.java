package stringExplanation;
public class StringRev {

	public static void main(String[] args) {
		//using stringBuilder/StringBuffer
		StringBuilder sb = new StringBuilder("Mumbai");
		sb.reverse();
		System.out.println("Reverse of a string ="+ sb);
		//without using inbuilt method
		
		String s = "Pune";
		String rev = "";
		
		System.out.println("Length of String ="+ s.length());
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev +s.charAt(i);
		}
		System.out.println("Reverse of a string ="+ rev);
	}
}
