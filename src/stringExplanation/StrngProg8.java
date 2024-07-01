package stringExplanation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StrngProg8 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		String[] s = d.toString().split(" ");
		
		for(String data:s) {
			System.out.println(data);
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		String date = sdf.format(d);
		System.out.println(date);
		

	}

}
