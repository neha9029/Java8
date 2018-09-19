package dataTimeAPI;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		String sTime = LocalTime.now().toString();
		System.out.println(sTime);
		
		
		LocalTime time = LocalTime.of(23, 45, 23,767667);
		System.out.println(time);
		
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());


		
	}

}
