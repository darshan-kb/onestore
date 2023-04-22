package com.application.oneestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.oneestore.entites.ShippingDetails;
import com.application.oneestore.services.ShippingService;

@RestController
public class ShippingAddressController {
	
	@Autowired
	ShippingService ss;

	@PostMapping("/shipping")
	public ShippingDetails addShippingDetail(@RequestBody ShippingDetails sd) {
		return ss.addNewShippingDetail(sd);
	}
}
