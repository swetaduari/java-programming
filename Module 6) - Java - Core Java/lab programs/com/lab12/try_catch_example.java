package com.lab12;

class try_catch_example {
	
	public static void main(String[] args) 
	{
		
		try
		{
			int data = 10/0;
			System.out.println(data);
		}
		catch(Exception e)
		{	
			e.printStackTrace();
			//System.out.println(e);
		}
		finally
		{
			System.out.println("Executed");
		}
		

}
	
}

