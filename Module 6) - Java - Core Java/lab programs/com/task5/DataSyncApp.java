package com.task5;
import java.util.Random;

class DataChecker implements Runnable
{
	public void run()
	{
		Random random= new Random();
		try
		{
			 while(true)
			 {
				 System.out.println("Checking for new data...");
				 
				 int newData= random.nextInt(2);
				 
				 if(newData>0)
				 {
					 System.out.println("New data found syncing data..."+newData);
				 }
				 else 
				 {
					 System.out.println("no New data found, Continuing"+newData);
				 }
				 Thread.sleep(10000);// wait 10 seconds
				 }
			 
		}
			 catch(InterruptedException e)
			 {
				 System.out.println("Data checker thread  stopped");
				 
			 }
		
		
	}
}
public class DataSyncApp {
	
	public static void main(String[] args)

	{
		Thread dataThread=new Thread(new DataChecker());
		dataThread.setDaemon(true);
		dataThread.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread Processing user Request"+i);
			try
			{
				Thread.sleep(5000);//Stimulate main  thread work
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("main thread finished work. Program ends");
	}
	
}
