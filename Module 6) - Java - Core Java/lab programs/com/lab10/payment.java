package com.lab10;
//Implement an interface for a real-world example,such as a payment gateway.

interface PaymentGateway
{
void makePayment(double amount);
}



 class creditCard implements  PaymentGateway
{
	 public void makePayment(double amount) {
	        System.out.println("Paid " + amount + " using Credit Card.");
	    }
}

class PayPal implements PaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
	
public class payment {
    public static void main(String[] args) {
        PaymentGateway payment;

        payment = new creditCard();
        payment.makePayment(100.0);  // Calls CreditCard implementation

        payment = new PayPal();
        payment.makePayment(200.0);  // Calls PayPal implementation
    }
}	



