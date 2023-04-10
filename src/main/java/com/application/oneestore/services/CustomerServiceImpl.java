package com.application.oneestore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.application.oneestore.model.Customer;
import com.application.oneestore.entites.Customers;
import com.application.oneestore.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerrepo;
	
	@Override
	public String createCustomer(Customers customer) {
		// TODO Auto-generated method stub
		//return "good";
		return customerrepo.save(customer).toString();
		//return null;
	}

}
