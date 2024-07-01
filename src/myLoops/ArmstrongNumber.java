package myLoops;

public class ArmstrongNumber {//armstrong number is equal to the sum of cubes of its digits
							//e.g. 153= 1^3+5^3+3^3

	public static void main(String[] args) {
		int no =153;
		int rem = 0;
		int ams = 0;
		int temp =no;
		while(no>0) {
			rem = no%10;
			ams = ams + (rem*rem*rem);
			no = no/10;
		}
		if(ams==temp) {
			System.out.println("Entered number is a armstrong :"+ ams);
		}
		else {
			System.out.println("Entered number is not a armstrong: "+ ams);
		}
	}
}
