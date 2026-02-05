package com.lab10;
//Create an abstract class and implement its methods in a subclass

abstract class A
{
	abstract void a();
	
	void b()
	{
	System.out.println("Sweta");	
	}
	
}

class B extends A
{

	@Override
	void a() {
		System.out.println("Ankita");
		
	}
	
}

public class abstract_example
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.a();
		b1.b();
	}
}