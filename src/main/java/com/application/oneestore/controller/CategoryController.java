package com.application.oneestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/getAllCategory")
	public List<Object> getAllCategory() {
		return categoryservice.getAllCategory();
	}
}
