package com.lab3;
import java.util.*;

class oddeven
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        if (number % 2 == 0) 
        {
            System.out.println("The given number " + number + " is Even");
        } 
        else
        {
            System.out.println("The given number " + number + " is Odd");
        }
        sc.close();
	}
}
