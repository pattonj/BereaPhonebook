package com.jacob.patton.bereaphonebook;

import java.util.ArrayList;
import java.util.List;


public class PhoneBookDataStored {
	//Master database
	public List<String[]> database;
	
	
	public List<String[]> createdata(){
		//[Title,phone number,email, address ,hours]
		
		
		 database = new ArrayList<String[]>();
		 		
				database.add(new String[]{"Public Safety","(859)-985-3333","abc@berea.edu","CPO 2148","Open 24 Hours"});
				database.add(new String[]{"Health Services","(859)-985-3212","123@berea.edu","CPO 2174","\nM,T,Th,Fri 8 am - 5 pm\nW 8 am - 12 pm, 2 pm - 5pm\nClosed 12 - 1 for lunch."});
				database.add(new String[]{"Student Services","(859)-985-3310","def@berea.edu","CPO 2172","M - Fri \n 8:30 am - 12 pm, \n1 pm - 4:30 pm"});
				database.add(new String[]{"Financial Aid","(859)-985-3237","456@berea.edu","CPO 2205","M - Fri 8 am - 5 pm"});
				database.add(new String[]{"Labor Office","(859)-985-3611","ghi@berea.edu","CPO 2180","M - Fri 8 am - 5 pm"});
				database.add(new String[]{"IS&S","(859)-985-3343","789@berea.edu","CPO 2208","M - Fri 8 am - 5 pm"});
				
				
			return database;
	}
	
	


}