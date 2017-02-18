import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeConversionPart1 {
	
public static void main(String [] args) throws Exception{
	
	//Prompt the user to enter time in 24 hrs format for example 1800
		System.out.print("Enter time in 24 hour format:");
	
		Date date = new Date(); //Creating a date object
		 
	           SimpleDateFormat _24HourSDF = new SimpleDateFormat("HH:mm");
	           SimpleDateFormat _12HourSDF = new SimpleDateFormat("hh:mm a");
	           
	           System.out.println(_12HourSDF.format(_24HourSDF));
	           
}   
	           
	          
	          
	     
	   }
	
		
	 
	   

		      


