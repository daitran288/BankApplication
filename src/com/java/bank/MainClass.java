package com.java.bank;

import com.java.bank.banch.dto.Customer;
import com.java.bank.service.CustomerService;

public class MainClass {

	
	public static void main(String[] args) {
		Customer customer = generateCustommerInformation();
		Customer newCustomer = CustomerService.signUp(customer);
	}

	private static Customer generateCustommerInformation() {
		Customer customer = new Customer();
		customer.setFirstName("Joe");
		customer.setLastName("Billy");
		customer.setAge(31);
		customer.setOccupation("Doctor");
		return customer;
	}

}
