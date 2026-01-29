package com.task3;

public class CheckingAccount {
	
	
	private int acn;
	private double balance;
	
	
	public CheckingAccount(int acn)
	{
		this.acn=acn;
	}
	public void deposit(double amount)
	{
		this.balance=amount;
	}
	public double getbalance()
	{
		return balance;
	}
	public void withdraw(double amount) throws InsufficientFundException
	{
		if(amount<=balance)
		{
			balance=balance-amount;
		}
	
	    else
	    {
		double needs=amount-balance;
		
		throw new InsufficientFundException(needs);
	    }
	
	}
	
}
