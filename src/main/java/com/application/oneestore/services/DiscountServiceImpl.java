package com.application.oneestore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.oneestore.entites.Discount;
import com.application.oneestore.repository.DiscountRepository;

@Service
public class DiscountServiceImpl implements DiscountService {
	
	@Autowired
	DiscountRepository discountrepo;

	@Override
	public Discount addNewDiscount(Discount discount) {
		// TODO Auto-generated method stub
		
		return discountrepo.save(discount);
	}
	
	
}
