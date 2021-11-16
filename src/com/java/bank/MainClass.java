package com.java.bank;

import com.java.bank.banch.dto.Customer;
import com.java.bank.service.CustomerService;

public class MainClass {

	
	public static void main(String[] args) {
		Customer customer = generateCustommerInformation();
	}

	private static Customer generateCustommerInformation() {
		Customer customer = new Customer();
		customer.setFirstName("Jane");
		customer.setLastName("Bob");
		customer.setAge(31);
		customer.setOccupation("Janitor");
		return customer;
	}

}
