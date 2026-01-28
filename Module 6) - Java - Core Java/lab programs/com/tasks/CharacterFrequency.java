package com.tasks;

import java.util.Scanner;

public class CharacterFrequency {

    public static void charFrequencies(String input) {
        // Create an array to store the count of each character (using ASCII values as indices)
        int[] counts = new int[256];

        // Convert the input string to lowercase for case-insensitive counting
        // (Optional: remove .toLowerCase() for case-sensitive counting)
        String processedInput = input.toLowerCase();

        // Iterate over the string and increment the count for each character
        for (int i = 0; i < processedInput.length(); i++) {
            char currentChar = processedInput.charAt(i);
            // Use the character's ASCII value as the array index
            counts[currentChar]++;
        }

        // Iterate through the counts array and print the results for characters that appeared
        System.out.println("Character frequencies:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                // Cast the index back to a char to display the character
                System.out.println("'" + (char)i + "': " + counts[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();

        charFrequencies(userInput);
    }
}

