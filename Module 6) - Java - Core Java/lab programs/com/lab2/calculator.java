package com.lab2;


import java.util.Scanner;

public class calculator {

 public static void main(String[] args)
 {
    
     double num1, num2;

    
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number1:");
     num1 = sc.nextDouble();
     System.out.println("Enter the number2:");
     num2 = sc.nextDouble();

     System.out.println("Enter the operator (+,-,*,/):");

     char op = sc.next().charAt(0);
     double r = 0;

     switch (op) {
    
     case '+':
         r= num1 + num2;
         break;

   
     case '-':
         r = num1 - num2;
         break;

    
     case '*':
         r = num1 * num2;
         break;

     
     case '/':
         r = num1 / num2;
         break;

     default:
         System.out.println("You enter wrong input");
     }

     System.out.println("The final result:");
     System.out.println();

    
     System.out.println(num1 + " " + op + " " + num2
                        + " = " + r);
 }
}