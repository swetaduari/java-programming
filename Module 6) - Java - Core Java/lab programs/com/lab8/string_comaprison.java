package com.lab8;
//using equals method
public class string_comaprison {
	public static void main(String[] args)
	{
		String s1 = "sachin";
		String s2 = "sachin";
		String s3 = "ratan";
		String s4 = new String("sachin");
		String s5 = "SACHIN";
		String s6 = "dharini";
		
		//equals
		System.out.println(s1.equals(s2));//returns true
		System.out.println(s1.equals(s4));// returns true
		System.out.println(s1.equals(s3));// return false
		
		
		//compareTo
		System.out.println(s1.compareTo(s2));//
		System.out.println(s1.compareTo(s3));// first checks the  first index character and generates an ascii value of 115 and then it generates the other word ascii value of r which is 114 and then substract both the ascii value so it in 1 and then returns 1  
		System.out.println(s1.compareTo(s6));//ascii of s is 115 and d is 100 which means 15
		
		
	}

}
