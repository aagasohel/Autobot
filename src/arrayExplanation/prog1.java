package arrayExplanation;

public class prog1 {

	public static void main(String[] args) {
		String[] studentName = {"sohel","mohsin","tina","megha"};
		
		for(int i=0; i<studentName.length; i++) {
			System.out.println(studentName[i]);
		}
		System.out.println("-------------------------");
		
		for(String data :studentName) {
			System.out.println(data);
		}

	}

}
