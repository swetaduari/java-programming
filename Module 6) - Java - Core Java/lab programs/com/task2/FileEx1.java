package com.task2;

import java.io.FileOutputStream;
import java.util.Scanner;


public class FileEx1 {

	public static void main(String[] args)
	{   try
		{
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter name ");
         String n = sc.next();
         System.out.println("Enter password");
         String p= sc.next();
         FileOutputStream fout= new FileOutputStream("D://student.text");
         fout.write(n.getBytes());
         fout.write(p.getBytes());
         System.out.println("Executed");
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
         
	
	}
}
