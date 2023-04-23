package com.application.oneestore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.oneestore.entites.Categories;
import com.application.oneestore.repository.CategoriesRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoriesRepository catrepo;

	@Override
	public Categories addNewCategory(Categories category) {
		// TODO Auto-generated method stub
		return catrepo.save(category);
	}

	@Override
	public List<Object> getAllCategory() {
		// TODO Auto-generated method stub
		List<Object> all = catrepo.findProductsWithCategory();
		
		return all;
	}
	
}
