package com.kiranacademy.abstractionex;

import java.sql.Date;
import java.util.Calendar;

public class GreetingTime {
	public	String getTimeFromAndroid() {
        Date dt = new Date(12, 10, 22);
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        int hours = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);

        if(hours<=12){       
            return "Good Morning";
        }else if(hours<=16){        
            return "Good Afternoon";        
        }else if(hours<=21){         
            return "Good Evening";        
        }else {
            return "Good Night";
        }              
    }
	
}
