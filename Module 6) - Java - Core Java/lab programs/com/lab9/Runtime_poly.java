package com.lab9;
//Implement runtime polymorphism by overriding methods in the child class.
class Person {

 
 void role() {
     System.out.println("I am a person.");
 }
}


class Father extends Person {


 @Override
 void role() {
     System.out.println("I am a father.");
 }
}

public class Runtime_poly {
 public static void main(String[] args) {
   
     
     Person p = new Father();
     p.role();  // calls only father class
 }
}
