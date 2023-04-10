package com.application.oneestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.oneestore.entites.Discount;
import com.application.oneestore.services.DiscountService;

@RestController
public class DiscountController {
	
	@Autowired
	DiscountService discountservice;
	
	@PostMapping("/discount")
	public Discount addDiscount(@RequestBody Discount discount) {
		return discountservice.addNewDiscount(discount);
	}
}
