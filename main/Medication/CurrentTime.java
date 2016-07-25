package Medication;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentTime {
	 public String getTime() 
	 {   
        Calendar calendar = new GregorianCalendar();   
        String am_pm;   
        int hour = calendar.get( Calendar.HOUR );   
        int minute = calendar.get( Calendar.MINUTE );  
       // int month= calendar.get(Calendar.getInstance();
        // int second = calendar.get(Calendar.SECOND);   
       
        String time = hour +":"+ minute+"am_pm";     
        return time;
} 
}
