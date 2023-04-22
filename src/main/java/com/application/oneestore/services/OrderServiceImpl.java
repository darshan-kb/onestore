package com.application.oneestore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.oneestore.entites.Orders;
import com.application.oneestore.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderrepo;

	@Override
	public Orders addNewOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderrepo.save(order);
	}

}
