package com.application.oneestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.oneestore.entites.Categories;
import com.application.oneestore.entites.Products;
import com.application.oneestore.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;

	@PostMapping("/product")
	public Products addProduc(@RequestBody Products product) {
		System.out.println(product.toString());
		return productservice.addNewProduct(product);
	}
	
	@PostMapping("/findByCategory")
	public List<Products> addProduc(@RequestBody Categories cat) {
		//System.out.println(product.toString());
		return productservice.findByCategory(cat);
	}
}
