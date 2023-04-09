package com.application.oneestore.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.oneestore.model.Customer;

@RestController
public class CustomerController {
	
	@PostMapping("/createcustomer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customer;
	}
}
