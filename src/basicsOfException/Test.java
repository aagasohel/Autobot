package basicsOfException;

public class Test {

	public static void main(String[] args) throws  InterruptedException {
		System.out.println("Start");
		int a = 20;
		int b =0;
		int res =0;
		Thread.sleep(2000);
		try {
			res = a/b;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Division ="+ res);
			System.out.println("end");
		}
		
		

	}

}
