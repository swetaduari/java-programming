package com.lab14;

import java.io.Serializable;

public class student implements Serializable
{
	int id;
	String name;
	
	public student(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
}