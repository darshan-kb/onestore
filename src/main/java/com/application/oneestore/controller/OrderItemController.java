package com.application.oneestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.oneestore.entites.OrderItems;
import com.application.oneestore.services.OrderItemService;

@RestController
public class OrderItemController {
	
	@Autowired
	OrderItemService orderitemservice;
	
	@PostMapping("/addorderitem")
	public OrderItems addOrderItem(@RequestBody OrderItems orderitem) {
		return orderitemservice.addNewOrderItem(orderitem);
	}
}
