package com.lab15;

import java.util.ArrayList;
import java.util.Iterator;

//lab 15.1 Write a program that demonstrates the use of an ArrayList and LinkedList.
public class ArraylistDemo {
	public static void main(String[] args)
	{
		ArrayList arrayL=new ArrayList();
		
		//add
		arrayL.add("orange");
		arrayL.add("Apple");
		arrayL.add("mango");
		arrayL.add("Strawberry");
		arrayL.add("cake");
		arrayL.add("cherry");
		
		Iterator<String> i=arrayL.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
