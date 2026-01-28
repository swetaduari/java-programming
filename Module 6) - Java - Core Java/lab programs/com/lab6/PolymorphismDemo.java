package com.lab6;

class doll
{
	void SnowWhite()
	{
		System.out.println("The doll brand is Snow white");
	}
}

class Disney extends doll
{
	void SnowWhite()
	{
		System.out.println("The snow white has 7 dwarfs");
	}
}

public class PolymorphismDemo{
	public static void main (String[] args)
	{
		Disney d= new Disney();
		d.SnowWhite();
	}
}