package com.lab14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serializede
{
	public static void main(String[] args)
	{
		
		try 
		{
			student s1 = new student(101,"manan");
			FileOutputStream fout = new FileOutputStream("C://java.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Executed");
	}
}

// serializede