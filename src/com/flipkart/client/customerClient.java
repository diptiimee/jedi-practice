package com.flipkart.client;

import com.flipkart.business.customerService;

public class customerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customerService service = new customerService();
		System.out.println(service.createCustomer());
		System.out.println(service.deleteCustomer(101));
		System.out.println(service.updateCustomer(101));
		service.listCustomer();
		
	}

}
