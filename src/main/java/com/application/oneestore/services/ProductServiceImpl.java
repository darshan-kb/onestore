package com.application.oneestore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.oneestore.entites.Products;
import com.application.oneestore.repository.ProductsRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductsRepository productrepo;

	@Override
	public Products addNewProduct(Products product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}
	
	
}
