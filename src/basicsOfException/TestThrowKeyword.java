package basicsOfException;

public class TestThrowKeyword {
    void validateAge(int age) {
    	if(age>=18) {
    		System.out.println("You are eligible to vote");
    	}
    	else {
    		throw new ArithmeticException("you are not eligible to vote");
    	}
    }
    public static void main(String[] args) {
    	TestThrowKeyword ttk = new TestThrowKeyword();
    	ttk.validateAge(17);
	}
}
