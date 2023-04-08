package com.application.oneestore.entites;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long category_ID;
	private String cat_1;
	private String cat_2;
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
	public Categories(long category_ID, String cat_1, String cat_2) {
		super();
		this.category_ID = category_ID;
		this.cat_1 = cat_1;
		this.cat_2 = cat_2;
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
