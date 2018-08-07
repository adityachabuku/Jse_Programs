package com.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalenderDates {

	public static void main(String[] args) {
		
	    int day1=0;
	    int month1=0;
	    int year1=0;
	 
	    int day2=0;   
	    int month2=0;
	    int year2=0;
	    try {
	    	System.out.println("enter date 1 in dd/mm/yyyy");
	    	Scanner s = new Scanner(System.in).useDelimiter("[/\\s]");  //Input for Date 1
	    	     
	    	      day1= s.nextInt();
	    	      month1 = s.nextInt();
	    	      year1 = s.nextInt();

	    	System.out.println("Date1   : " + day1 + "/" + month1 + "/"  + year1);	
	    	System.out.println("enter date 2 in dd/mm/yyyy");
	    	s=new Scanner(System.in).useDelimiter("[/\\s]");
	    	  day2= s.nextInt();
    	      month2 = s.nextInt();
    	      year2 = s.nextInt();

    	System.out.println("Date2   : " + day2 + "/" + month2 + "/"  + year2);	
	    
	    }catch (Exception e) {
	    	System.out.println("entered format is wrong");
		}
	    
	Calendar c1=Calendar.getInstance();
	Calendar c2=Calendar.getInstance();
	c1.set(year1,month1,day1);
	c2.set(year2,month1,day1);
	Long MilliSecForc1=c1.getTimeInMillis();
	Long MilliSecForc2=c2.getTimeInMillis();
	System.out.println(MilliSecForc1);
	System.out.println(MilliSecForc2);

	Long diffInMilis=MilliSecForc2-MilliSecForc1;
	if(diffInMilis<0) {
		diffInMilis=-(diffInMilis);
	}
	System.out.println(diffInMilis);
	   long diffInSecond = diffInMilis / 1000;
	    long diffInMinute = diffInMilis / (60 * 1000);
	    long diffInHour = diffInMilis / (60 * 60 * 1000);
	    long diffInDays = diffInMilis / (24 * 60 * 60 * 1000);
	    long diffInWeek =diffInMilis/(7*24*60*60*1000);
	    
	    System.out.println("Difference in Seconds : " + diffInSecond);
	    System.out.println("Difference in Minute : " + diffInMinute);
	    System.out.println("Difference in Hours : " + diffInHour);
	    System.out.println("Difference in Days : " + diffInDays);
	    System.out.println("Difference in week : " + diffInWeek);

	  
	 
	}

}
