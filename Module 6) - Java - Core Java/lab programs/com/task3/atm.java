package com.task3;

public class atm {
	
	public static void main(String[] args) 
	{ 
		atm a= new atm();
		CheckingAccount ca = new CheckingAccount(102);
		ca.deposit(50000);
		
	  
	
	try
	{
		ca.withdraw(7000);
		System.out.println("your balance is ="+ca.getbalance());
	}
	catch(InsufficientFundException e){
		System.out.println("You have no sufficient balance, You need more  "+e.getAmount());
		System.out.println("Your balance is = "+ca.getbalance());
	}


}
}
