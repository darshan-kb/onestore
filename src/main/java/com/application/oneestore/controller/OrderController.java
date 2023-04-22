package com.application.oneestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.oneestore.entites.Orders;
import com.application.oneestore.services.OrderService;


@RestController
public class OrderController {
	
	@Autowired
	OrderService orderservice;
	
	@PostMapping("/neworder")
	public Orders addOrder(@RequestBody Orders order) {
		return orderservice.addNewOrder(order);
	}
}
