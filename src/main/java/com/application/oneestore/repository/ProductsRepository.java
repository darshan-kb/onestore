package com.application.oneestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.oneestore.entites.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{

}
