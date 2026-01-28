package com.lab9;
//Write a program that demonstrates inheritance using extends keyword.
//Super class
class dress
{   void type()
	{
	System.out.println("There are many types of Dress");
	}
}
//subclass
class kurta extends dress
{
	void material()
	{
		System.out.println("material used in kurta is cotton");
	}
}
//main method
public class Inheritance 
{
	  public static void main(String[] args) 
	  {
	        kurta a=new kurta();
	        a.material();
	        a.type();

      }
}
