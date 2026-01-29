package com.task3;

public class InsufficientFundException extends Exception
{
  double amount;
  public InsufficientFundException(double amount)
  {
	  this.amount=amount;
  }
  public double getAmount()
  {
	  return amount;
  }
}
