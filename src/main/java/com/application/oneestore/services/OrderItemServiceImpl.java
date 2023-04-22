package com.application.oneestore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.oneestore.entites.OrderItems;
import com.application.oneestore.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService {
	
	@Autowired
	OrderItemRepository orderitemrepo;

	@Override
	public OrderItems addNewOrderItem(OrderItems orderitem) {
		// TODO Auto-generated method stub
		return orderitemrepo.save(orderitem);
	}

	
}
