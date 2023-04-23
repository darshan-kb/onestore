package com.application.oneestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.oneestore.entites.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long>{
	
	@Query("SELECT p FROM Products p JOIN p.category c")
	List<Object> findProductsWithCategory();
	
	
}
