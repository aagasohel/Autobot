package basicsOfException;



public class Test2 {

	public static void main(String[] args) {
        System.out.println("Start");
        int[] a = {5,23,67,88,12};
        int res = 0;
        
        try {
        	System.out.println(a[2]);
        	res = a[0]/0;
        }
//        catch(ArrayIndexOutOfBoundsException ai) {
//        	ai.printStackTrace();
//        }
//        catch(ArithmeticException ae) {
//        	ae.printStackTrace();
//        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        finally {
        	System.out.println(res);
        	System.out.println("End");
        }
	}

}
