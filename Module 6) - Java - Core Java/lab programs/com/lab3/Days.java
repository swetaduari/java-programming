package com.lab3;

public class Days {

	public static void main(String[] args) {
		int day = 3;
		String dayname;

		switch (day) {
		    case 1:
		        dayname = "Sunday";
		        break; 
		    case 2:
		        dayname = "Monday";
		        break;
		    case 3:
		        dayname = "Tuesday";
		        break;
		   
		    case 7:
		        dayname= "Saturday";
		        break;
		    default:
		        dayname = "Invalid day";
		        break;
		}
		System.out.println("The day is " + dayname);

	}

}
