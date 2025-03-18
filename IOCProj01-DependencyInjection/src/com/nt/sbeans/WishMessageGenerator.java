package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator
{
 private LocalTime time;
 private LocalDate date;

public void setTime(LocalTime time)
{
	this.time = time;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public String showWishMessage(String user)
{
	System.out.println("WishMessageGenerator.showWishMessage()");
	
	int hour = time.getHour();
	if(hour<12)
		return "Good Morning : " + user ;
	else if(hour<16)
		return "Good Afternoon : " + user ;
	else if(hour<18)
		return "Good Evening : " + user ;
	else 
		return "Good Night : " + user ;	
	
}
	private String determineSeason() 
	{
        int month = date.getMonthValue();
        
        if (month >= 3 && month <= 5)
            return "Summer";
        else if (month >= 6 && month <= 9)
            return "Rainy";
        else
            return "Winter";  
  }
	
	 public String showSeason() { 
	        return  determineSeason();
	    }
}
