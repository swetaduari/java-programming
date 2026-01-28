package com.lab5;

public class max3 {

	    // Method to find maximum of three numbers
	    static int findMax(int a, int b, int c) {
	        if (a >= b && a >= c)
	            return a;
	        else if (b >= a && b >= c)
	            return b;
	        else
	            return c;
	    }

	    public static void main(String[] args) {
	        int max = findMax(10, 25, 15);
	        System.out.println("Maximum number is: " + max);
	    }
	}



