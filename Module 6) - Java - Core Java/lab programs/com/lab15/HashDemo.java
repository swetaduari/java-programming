package com.lab15;

import java.util.ArrayList;
import java.util.HashSet;

// Implement a program using HashSet to remove duplicate elements from a list.

public class HashDemo {
	
	public static void main(String[] args)
	{
		
		
		ArrayList b= new ArrayList();
		HashSet a= new HashSet(b);// converting arrayList to HashSet
		
		
		a.add("ho");
		a.add("ha");
		a.add("hey");
		a.add("hu");
		a.add("hello");
		a.add("ho");// duplicate items removed
		a.add("ho");//duplicate items removed
		
	
		
		System.out.println(a);
		
		
	}

}
