package com.lab15;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap to store and retrieve key-value pairs.

public class HashmapDemo {
	
	public static void main (String[] args)
	{
		HashMap<Integer,String> m= new HashMap();
		
		

		m.put(110,"Sweta");
		m.put(111,"Ankita");
		m.put(112,"Shankar");
		
		
		for(Map.Entry s: m.entrySet())
		{
			System.out.println(s.getKey());
			System.out.println(s.getValue());
			
		}
		
	}

}
