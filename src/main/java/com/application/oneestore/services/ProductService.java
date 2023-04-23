package com.application.oneestore.services;

import java.util.List;

import com.application.oneestore.entites.Categories;
import com.application.oneestore.entites.Products;

public interface ProductService {
	public Products addNewProduct(Products product);
	public List<Products> findByCategory(Categories cat);
}
