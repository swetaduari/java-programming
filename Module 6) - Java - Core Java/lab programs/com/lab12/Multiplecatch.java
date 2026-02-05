package com.lab12;
// Implement multiple catch blocks for different types of exceptions.

public class Multiplecatch {
	
	public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]); 
            int result = 10 / 0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Execution continues after the try-catch block.");
    }
}
