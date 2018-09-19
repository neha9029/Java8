package dataTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Current Zone
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		
		//Get Time of a particular zone
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		
		System.out.println(dt);
		
	}

}
