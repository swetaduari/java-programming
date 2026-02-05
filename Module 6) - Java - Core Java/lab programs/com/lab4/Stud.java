package com.lab4;

 public class Stud {
	      
	    String name;
	    int age;

	    // Constructor 1: No parameters
	    Stud() {
	        name = "Unknown";
	        age = 0;
	    }

	    // Constructor 2: One parameter
	    Stud(String name) {
	        this.name = name;
	        this.age = 0;
	    }

	    // Constructor 3: Two parameters
	    Stud(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display details
	    void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println();
	    }

	    // Main method to demonstrate constructor overloading
	    public static void main(String[] args) {
	        Stud s1 = new Stud();
	        Stud s2 = new Stud("Alice");
	        Stud s3 = new Stud("Bob", 18);

	        s1.displayDetails();
	        s2.displayDetails();
	        s3.displayDetails();
	    }
	}



