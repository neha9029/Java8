package dataTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Get Current Date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//Get Current Time
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//Get just today's date 
		int dd = date.getDayOfMonth();
		
		//Get just month
		int mm = date.getMonthValue();
		
		//Get Year
		int yyyy = date.getYear();
		
		//Print in format
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		System.out.println();
		
		//Get Hour 
		int h = time.getHour();
		
		//Get Minute 
		int m = time.getMinute();
		
		//Get Second
		int s = time.getSecond();
		
		//Get NanoSecond
		int n = time.getNano();
		
		System.out.printf("%d:%d:%d:%d", h,m,s,n);

	}

}
