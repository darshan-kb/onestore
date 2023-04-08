package com.application.oneestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.oneestore.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	//custom query method
}
