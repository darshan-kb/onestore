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
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long product_ID;
	private String product_name;
	private String product_description;
	private double price;
	private double quantity;
	private String imageURL;
	private String brand;
	private String color;
	private String product_dim;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Categories category;
	
	@ManyToOne
	@JoinColumn(name="discount_id")
	private Discount discount;

	public long getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(long product_ID) {
		this.product_ID = product_ID;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProduct_dim() {
		return product_dim;
	}

	public void setProduct_dim(String product_dim) {
		this.product_dim = product_dim;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public Products(long product_ID, String product_name, String product_description, double price, double quantity,
			String imageURL, String brand, String color, String product_dim, Categories category, Discount discount) {
		super();
		this.product_ID = product_ID;
		this.product_name = product_name;
		this.product_description = product_description;
		this.price = price;
		this.quantity = quantity;
		this.imageURL = imageURL;
		this.brand = brand;
		this.color = color;
		this.product_dim = product_dim;
		this.category = category;
		this.discount = discount;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Products [product_ID=" + product_ID + ", product_name=" + product_name + ", product_description="
				+ product_description + ", price=" + price + ", quantity=" + quantity + ", imageURL=" + imageURL
				+ ", brand=" + brand + ", color=" + color + ", product_dim=" + product_dim + "]";
	}
	
	
}
