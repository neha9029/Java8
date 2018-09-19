package dataTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate dt = LocalDate.of(2012,7, 8);
		System.out.println(dt);
		
		LocalDate current = LocalDate.now();
		System.out.println(current);

		String str = LocalDate.now().toString();
		System.out.println(str);
		
		//Min Year is -999999999     Max Year is 999999999
		LocalDate t = LocalDate.of(-26343344, 8, 9);
		
		LocalDate d = LocalDate.of(2016,Month.DECEMBER, 9);
		System.out.println(d);
		
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getMonthValue());
        System.out.println(d.getYear());
        
        
        
	}

}
