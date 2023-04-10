package com.application.oneestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.oneestore.entites.Categories;
import com.application.oneestore.services.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	CategoryService categoryservice;
	
	@PostMapping("/category")
	public Categories addCategory(@RequestBody Categories cat) {
		return categoryservice.addNewCategory(cat);
	}
}
