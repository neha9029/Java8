package dataTimeAPI;

import java.time.Year;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Year y = Year.of(1991);
		Year u = Year.of(1992);
		if(y.isAfter(u)) {
			System.out.println("y is after u");
			
		}
		else {
			System.out.println("u is after y");
		}
		
		if(y.isLeap()) {
			System.out.printf("%d is leap", y);
		}
		else {
			System.out.println(y+" is not leap");
		}
	}

}
