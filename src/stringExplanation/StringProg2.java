package stringExplanation;

public class StringProg2 {

	public static void main(String[] args) {
		StringProg2 s = new StringProg2();
		int ind = s.getIndexOfChar("Pune",'n');
		System.out.println(ind);
		
		int ind1 = s.getIndexOfChar("Mumbai", 'a');
		System.out.println(ind1);
		

	}

	 int getIndexOfChar(String input, char ch) {
		int index = input.indexOf(ch);
		return index;
	}

	
}
