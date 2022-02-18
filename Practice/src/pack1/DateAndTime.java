package pack1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		System.out.println(d.toString());// default date
		
		// for make it in format MM/dd/yyyy HH:mm:ss
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(sdf.format(d));
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
			
			
		
		
		
		
		 
	}

}
