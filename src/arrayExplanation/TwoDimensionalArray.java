package arrayExplanation;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		int[][] b = {{10,20,30,40},{100,200,300,400},{1000,2000,3000,4000}};
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[0][3] = 40;
		
		a[1][0] = 100;
		a[1][1] = 200;
		a[1][2] = 300;
		a[1][3] = 400;
		
		System.out.println(a[1][2]);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
