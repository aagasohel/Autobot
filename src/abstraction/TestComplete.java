package abstraction;

public class TestComplete extends Test{//concrete class implements abstract class
        
	public void division() {
		System.out.println("This is division method from Testcomplete class");
	}
	
	static void multiplication() {
		System.out.println("This is Multiplication method from TestComplete class");
	}
	
	public static void main(String[] args) {
		TestComplete obj = new TestComplete();
		obj.division();
		multiplication();
		Test.multiplication();
	}
}
