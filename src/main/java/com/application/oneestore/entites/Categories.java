package com.application.oneestore.entites;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long category_ID;
	private String cat_1;
	private String cat_2;
	
	
	
	@OneToMany(mappedBy = "product_ID")
	private List<Products> products;
	
	public long getCategory_ID() {
		return category_ID;
	}
	public void setCategory_ID(long category_ID) {
		this.category_ID = category_ID;
	}
	public String getCat_1() {
		return cat_1;
	}
	public void setCat_1(String cat_1) {
		this.cat_1 = cat_1;
	}
	public String getCat_2() {
		return cat_2;
	}
	public void setCat_2(String cat_2) {
		this.cat_2 = cat_2;
	}
	
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public Categories(long category_ID, String cat_1, String cat_2, List<Products> products) {
		super();
		this.category_ID = category_ID;
		this.cat_1 = cat_1;
		this.cat_2 = cat_2;
		this.products = products;
	}
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Categories [category_ID=" + category_ID + ", cat_1=" + cat_1 + ", cat_2=" + cat_2 + "]";
	}
	
	
}
