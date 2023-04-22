package com.application.oneestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.application.oneestore.entites.Customers;

import com.application.oneestore.model.Customer;
import com.application.oneestore.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@PostMapping("/createcustomer")
	public Customers createCustomer(@RequestBody Customers customer) {
		return customerservice.createCustomer(customer);
	}
}
