package com.jacob.patton.bereaphonebook;

import java.util.ArrayList;
import java.util.List;


public class PhoneBookDataStored {
	//Master database
	public List<String[]> database;
	
	
	public List<String[]> createdata(){
		//[Department,phone number, cpo, email, location ,hours]
		//[0		 ,1			  ,2   ,3	  ,4		 ,5		]
		
		 database = new ArrayList<String[]>();
		
		 database.add(new String[]{"Public Safety ","(859)-985-3333","2184","public_safety@berea.edu","Woods-Penniman","Open 24 hours"});
		 
		 database.add(new String[]{"Academic Services","(859)-985-3208","2205","stuacserv@berea.edu","Lincoln 110","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Alumni Relations","(859)-985-3104","2203","alumni_relations@berea.edu","Alumni Building","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Bookstore","(859)-985-3197","2213","bcbookstore@berea.edu ","108 Main Street","M.– Fri.: 9 am – 7 pm \n Sat.: 10 am - 6 pm"});
		 database.add(new String[]{"Campus Christian Center","(859)-985-3926","2165","shalamar_sandifer@berea.edu","Draper Building","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Campus Life","(859)-985-3290","2199","Jessica_Hemenway@berea.edu","Alumni 201","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Center For International Education","(859)-985-3453","2173","cie@berea.edu","Woods-Penniman","Varies throughout the year"});
		 database.add(new String[]{"Child Development Lab","(859)-985-3620","2144","redifordm@berea.edu","125 Jefferson Street","M.–  Fri.: 7:30 am – 5:30 pm"});
		 database.add(new String[]{"Facilities Management","(859)-985-3827","2202","jeff_reed@berea.edu","Facilities Building","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Financial Aid","(859)-985-3310","2172","finaid@berea.edu","Lincoln Hall","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Health Services","(859)-985-3212","2174","","St. Joseph Berea, 2nd Floor","\nM.,T.,Th.,Fri.: 8:30 am–5 pm \nW.: 8 am - 12 pm, 2 pm - 5 pm"});
		 database.add(new String[]{"Labor Office","(859)-985-3611","2180","labor_program@berea.edu","Fairchild Hall","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Learning Center","(859)-985-3656","","Becky_Grandgeorge@berea.edu","3rd floor Bruce-Trades","Varies throughout the year"});
		 database.add(new String[]{"Library","(859)-985-3364","LIB ","circdesk@berea.edu","Hutchins Library","Varies throughout the year"});
		 database.add(new String[]{"People Services","(859)-985-3070","2189","Darlene_Stillwagoner@berea.edu","Fairchild Hall","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Post Office","(859)-985-3411","2147","beverly_cook@berea.edu","Woods-Penniman","M.– Fri.: 8:30 am – 4:30 pm"});
		 database.add(new String[]{"President's Office","(859)-985-3520","2182","sherry_thiele@berea.edu","Lincoln Hall","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Printing Services","(859)-985-3166","2183","printingservice@berea.edu","Bruce-Trades Building","M.– Fri.: 8 am – 5 pm"});
		
		 database.add(new String[]{"Residential Life","(859)-985-3115","2167","beverly_abney@berea.edu","Woods-Penn 302","M.– Fri.: 8 am – 5 pm"});
		 database.add(new String[]{"Student Services","(859)-985-3094","2168","Wanda_Burch@berea.edu","Lincoln Hall, First Floor","M.– Fri.: 8:30 am–4:30 pm"});
		 database.add(new String[]{"Technology Resource Center","(859)-985-3343","2208","help_desk@berea.edu","Computer Center","M.– Fri.: 8 am – 5 pm"});

				
				
			return database;
	}
	
	


}