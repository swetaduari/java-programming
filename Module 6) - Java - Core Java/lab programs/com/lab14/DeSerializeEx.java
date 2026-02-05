package com.lab14;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializeEx {
	

	
	public static void main(String[] args) 
	{
		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://java.txt"));
			student s1 = (student) in.readObject();
			System.out.println(s1.id+" "+s1.name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
