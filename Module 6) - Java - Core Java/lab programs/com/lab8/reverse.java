package com.lab8;
import java.util.Scanner;

public class reverse {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string to reverse:");
		
		String  originalString= scanner.nextLine();
		
		StringBuilder stringBuilder= new StringBuilder(originalString);
		
		stringBuilder.reverse();
		
		String reversedString= stringBuilder.toString();
		System.out.println("Original string:"+originalString);
		
		
		System.out.println("reversed string:"+reversedString);
		
		
		if(originalString.equals(reversedString))
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
