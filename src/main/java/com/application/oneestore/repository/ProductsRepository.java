package com.application.oneestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.oneestore.entites.Categories;
import com.application.oneestore.entites.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{
	
	List<Products> findByCategory(Categories cat);
}
