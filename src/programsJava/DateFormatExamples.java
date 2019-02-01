package programsJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String pattern = "MM-dd-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		System.out.println(date);*/
		
		/*String pattern = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		System.out.println(date);*/
		
		String pattern = "dd-MMMM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		System.out.println(date);

	}

}
