package com.lab7;


class calculate
{ 
	int a,b;
	void calculate(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("the solution is "+(a*b));
	}
}

public class parameterised {
  public static void main(String[] args)
  {
	  calculate c1= new calculate();
	  c1.calculate(10, 900);
	  c1.display();
  }
}
