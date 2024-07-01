package arrayExplanation;

public class Test1 {

	public static void main(String[] args) {
		int[] a = {21,35,12,44,25,57};
		
		System.out.println("length of array ="+ a.length);
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
//		for(int i =0; i< a.length; i++) {
//			System.out.println(a[i]);
//		}
	
		for(int data:a) {
			System.out.println(data);
		}
	}

}
