package com.lab4;

public class Employee {
	 
	    private String name;
	    private int age;

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    // Setter for age
	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Main method to test encapsulation
	    public static void main(String[] args) {
	    	 Employee emp = new Employee();
	    	 emp.setName("Alice");
	    	 emp.setAge(16);

	        System.out.println("Name: " + emp.getName());
	        System.out.println("Age: " + emp.getAge());
	    }
	}



