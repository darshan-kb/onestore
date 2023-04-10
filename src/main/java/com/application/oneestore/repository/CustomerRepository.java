package com.application.oneestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.oneestore.entites.Customers;


public interface CustomerRepository extends JpaRepository<Customers, Long>{
	//custom query method
}
