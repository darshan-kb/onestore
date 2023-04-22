package com.application.oneestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.oneestore.entites.OrderItems;

public interface OrderItemRepository extends JpaRepository<OrderItems, Long>{

}
