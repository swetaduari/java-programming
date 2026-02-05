package com.lab15;

import java.util.Iterator;
import java.util.LinkedList;

//linked list demo
public class LinkedlistDemo {
    public static void main(String[] args)
    {
    	LinkedList l= new LinkedList();
    	
    	l.add("a");
    	l.add("b");
    	l.addLast("Sweta");// add elements after the previous elements not at the last
    	l.add("c");
    	l.addFirst("Ankita");//add elements to the first place
    	
    	System.out.println(l);
    	Iterator itr= l.iterator();
    	
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    		
    	}
    	
    }
}
