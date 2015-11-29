package pratyush;

import java.util.ArrayList;
import java.util.HashMap;

public class DateFormat {
	public static void main(String [] args){
		String dt="4th Nov 2015";//yyyy-dd-mm
		HashMap<String, String> month=new HashMap<String, String>();
		month.put("JAN", "01");
		month.put("FEB", "02");
		month.put("MAR", "03");
		month.put("APR", "04");
		month.put("MAY", "05");
		month.put("JUN", "06");
		month.put("JUL", "07");
		month.put("AUG", "08");
		month.put("SEP", "09");
		month.put("OCT", "10");
		month.put("NOV", "11");
		month.put("DEC", "12");
		
		String[] date=dt.split(" ");
		if (date.length!=3){
		return;
		}
		System.out.println(date[2]+"-"+date[0]+"-"+month.get(date[1].toString().toUpperCase()));
		
			
				
		ArrayList<String> al = new ArrayList<String>();
		//al.to
		ArrayList<String> str=al;
		
		
		
	}
}
