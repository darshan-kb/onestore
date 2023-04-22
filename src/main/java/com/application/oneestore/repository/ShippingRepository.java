package com.application.oneestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.oneestore.entites.ShippingDetails;

public interface ShippingRepository extends JpaRepository<ShippingDetails, Long>{

}
