package com.task6;

import java.util.*;

class Student
{
	int rollno;
	String name;
	int age;
	Student(int rollno, String name, int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}

class nameComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
	
   return s1.name.compareTo(s2.name);
	}
}

public class ComparatorDemo 
{
	 public static void main(String[] args) 
	 {
		 ArrayList al=new ArrayList();
		 al.add(new Student(101,"Sweta",20));
		 al.add(new Student(102,"Ankita",10));
		 al.add(new Student(103,"Tanuja",22));
		 
		 System.out.println("sorting by name");
		 Collections.sort(al,new nameComparator());
		 
		 Iterator itr=al.iterator();
		 
		 
		 while(itr.hasNext())
		 {
			 Student st=(Student)itr.next();
			 System.out.println(st.rollno+""+st.name+""+st.age);
		 }
		
	}
}


