package stringExplanation;

public class Test1 {

	public static void main(String[] args) {
		String s ="Sachin";
		System.out.println(s);
		s.concat("Tendulkar");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Virat");
		System.out.println(sb);
		sb.append(" Kohli");
		System.out.println(sb);
		
		StringBuilder sbd = new StringBuilder("MS");
		System.out.println(sbd);
		sbd.append(" Dhoni");
		System.out.println(sbd);
	}

}
