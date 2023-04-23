package com.application.oneestore.services;

import java.util.List;

import com.application.oneestore.entites.Categories;

public interface CategoryService {
	public Categories addNewCategory(Categories category);
	public List<Object> getAllCategory();
}
