package stringExplanation;

public class Test2 {

	public static void main(String[] args) {
		String s1 = new String("Mumbai");// 1.Heap Area 2.SCP
		String s2 = new String("pune");// 1.Heap 2.SCP
		String s3 = new String("Mumbai");// 1.Heap
		
		String s4 = "Nashik";//1.SCP
		String s5 = "pune";

	}

}
