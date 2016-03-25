package Date;

import java.text.DateFormat;
import java.util.GregorianCalendar;

// date calculation 

public class Date {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		GregorianCalendar gc = new GregorianCalendar(1989, 02, 12);
		gc.add(GregorianCalendar.YEAR, 30);
		java.util.Date d2 = gc.getTime();
		System.out.println(d2);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String sd = df.format(d2);
		System.out.println(sd);
	}

}
