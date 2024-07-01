package stringExplanation;

public class Test3 {

	public static void main(String[] args) {
		String s1 = new String("Pune");// 1.Heap  2.SCP
		String s2 = new String("Pune");// 1.Heap
		System.out.println(s1==s2);//It compares memory addresses of string
		System.out.println(s1.equals(s2));// It compares content of String
		
		String s3 ="Mumbai";//SCP
		String s4 = "Mumbai";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

	}

}
