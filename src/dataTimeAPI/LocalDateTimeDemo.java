package dataTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Current Date and Time using LocalDateTime 
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate d = LocalDate.of(1991,4,16);
		System.out.println(d);

		LocalTime t = LocalTime.now();
		System.out.println(t);

		
		LocalDateTime ldt = LocalDateTime.of(d, t);
		System.out.println(ldt);
		
		LocalDateTime ld = LocalTime.now().atDate(d);
		System.out.println(ld);
		
		LocalDateTime lt = LocalDate.now().atTime(t);
		
		LocalDateTime ltt = LocalDate.now().atTime(LocalTime.NOON);
		System.out.println(ltt);

		//Comparing two dates
		
		System.out.println(ld.isAfter(lt));
		System.out.println(ld.isBefore(lt));
		System.out.println(ld.isEqual(lt));
		LocalDate now = LocalDate.now();
		
		
		//IsLeapYear only for localdate not for localDateTime
		
		System.out.println(now.isLeapYear());

		
		LocalDate dd = ltt.toLocalDate();
		
		System.out.println(now.isAfter(dd));
		System.out.println(now.isBefore(dd));
		System.out.println(now.isEqual(dd));
		System.out.println(dd);
		
		LocalTime tt = ltt.toLocalTime();
		System.out.println(tt);

		
		
		//Period p = Period.between(t,now);
		
		//System.out.printf("%d of Days", p.getYears()*365);
		
		
		

	}

}
