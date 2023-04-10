package com.application.oneestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.oneestore.entites.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Long> {

}
