package week5.examples.test;

import week5.examples.Customer;

public class TestCustomer {

	public static void main(String[] args) {
	Customer aCustomer=new Customer(2,"ali");
	
	//Customer sCustomer=new Customer(12);
	
	System.out.println(aCustomer.getId());
	System.out.println(aCustomer.getAddress());

	}

}
