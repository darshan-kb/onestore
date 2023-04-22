package com.application.oneestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.oneestore.entites.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
