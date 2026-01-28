package com.lab13;
class A extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("A: "+i);
		}
	}
}
class B extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("B: "+i);
		}
	}
}

public class example1 
{
	public static void main(String[] args)
	{
		A a1 = new A();
		B b1 = new B();
		
		a1.start();
		b1.start();
		
	}
}