package com.application.oneestore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.oneestore.entites.ShippingDetails;
import com.application.oneestore.repository.ShippingRepository;

@Service
public class ShippingServiceImpl implements ShippingService{
	@Autowired
	ShippingRepository shiprepo;

	@Override
	public ShippingDetails addNewShippingDetail(ShippingDetails sd) {
		// TODO Auto-generated method stub
		return shiprepo.save(sd);
	}
}
