package com.lab5;

public class StaticEx {
			static int count = 0;//static variable
		
		public StaticEx() 
		{
			count++;
			System.out.println(count);
		}
		
		public static void main(String[] args) 
		{
			StaticEx s1 = new StaticEx();
			StaticEx s2 = new StaticEx();
		}
	}

