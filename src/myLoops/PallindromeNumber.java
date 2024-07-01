package myLoops;

public class PallindromeNumber {

	public static void main(String[] args) {//palindrome means when we reverse the number the number remains same
	
		int no =121;
		int rem =0;
		int rev = 0;
		int temp = no;
		
		while(no>0) {
			rem = no%10;
			rev = rev*10 + rem;
			no = no/10;
		}
		if(rev==temp) {
			System.out.println("Entered number is a pallindrome ="+rev);
		}
		else {
			System.out.println("Entered number is not a pallindrome ="+ rev);
		}
	}
}
