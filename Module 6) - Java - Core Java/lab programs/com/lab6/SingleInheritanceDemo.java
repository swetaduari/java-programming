package com.lab6;

class car
{
	void color()
	{
		System.out.println("The color of car is necessary");
	}
}

class hatchback extends car
{
	void speed()
	{
		System.out.println("The speed of this car is average");
	}
}
public class SingleInheritanceDemo
{
   public static void main(String[] args)
   {
	  hatchback h1= new hatchback();
	  h1.color();
	  h1.speed();
	  
   }
}
