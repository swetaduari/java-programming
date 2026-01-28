package com.lab9;
//Use the super keyword to call the parent class constructor and methods.
//Parent class (Superclass)
class Animal {
 String name;

 Animal(String name) {
     this.name = name;
     System.out.println("Animal constructor called. Name: " + name);
 }
}

//child class
class Dog extends Animal {
 String breed;

 Dog(String name, String breed) {
    
     super(name); 
     this.breed = breed;
     System.out.println("Dog constructor called. Breed: " + breed);
 }
}

//main method
public class Super_example {
 public static void main(String[] args) {
     Dog myDog = new Dog("Buddy", "Golden Retriever");
      }
}
