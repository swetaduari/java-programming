package com.lab6;
//Base class
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//Intermediate class
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Derived class
class Puppy extends Dog {
 void play() {
     System.out.println("Puppy is playing");
 }
}

public class MultilevelInheritanceDemo {
	 public static void main(String[] args) {
	        Puppy p = new Puppy();

	        p.eat();   // from Animal
	        p.bark();  // from Dog
	        p.play();  // from Puppy
	    }
}
