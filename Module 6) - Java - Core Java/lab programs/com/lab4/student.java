package com.lab4;


class student {
    String name;
    int age;

 
    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

   
    public static void main(String[] args) {
       student student1 = new student("Sweta", 20);
        student1.displayDetails();
        
    }
 
}
