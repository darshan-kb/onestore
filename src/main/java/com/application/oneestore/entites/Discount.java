package com.application.oneestore.entites;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long discount_ID;
	private String discount_code;
	private double discount_amt;
	private Date start_date;
	private Date end_Date;
	private double min_purchase_amt;
	
	
	
	@OneToMany(mappedBy = "product_ID")
	private List<Products> products;
	
	@Column(columnDefinition = "VARCHAR(10) DEFAULT 'NULL'")
	@Enumerated(EnumType.STRING)
	private DiscountType discount_type;

	public Discount(long discount_ID, String discount_code, double discount_amt, Date start_date, Date end_Date,
			double min_purchase_amt, DiscountType discount_type, List<Products> products) {
		super();
		this.discount_ID = discount_ID;
		this.discount_code = discount_code;
		this.discount_amt = discount_amt;
		this.start_date = start_date;
		this.end_Date = end_Date;
		this.min_purchase_amt = min_purchase_amt;
		this.discount_type = discount_type;
		this.products = products;
	}

	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public long getDiscount_ID() {
		return discount_ID;
	}

	public void setDiscount_ID(long discount_ID) {
		this.discount_ID = discount_ID;
	}

	public String getDiscount_code() {
		return discount_code;
	}

	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}

	public double getDiscount_amt() {
		return discount_amt;
	}

	public void setDiscount_amt(double discount_amt) {
		this.discount_amt = discount_amt;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}

	public double getMin_purchase_amt() {
		return min_purchase_amt;
	}

	public void setMin_purchase_amt(double min_purchase_amt) {
		this.min_purchase_amt = min_purchase_amt;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public DiscountType getDiscount_type() {
		return discount_type;
	}

	public void setDiscount_type(DiscountType discount_type) {
		this.discount_type = discount_type;
	}

	@Override
	public String toString() {
		return "Discount [discount_ID=" + discount_ID + ", discount_code=" + discount_code + ", discount_amt="
				+ discount_amt + ", start_date=" + start_date + ", end_Date=" + end_Date + ", min_purchase_amt="
				+ min_purchase_amt + ", discount_type=" + discount_type + "]";
	}
	
	
	
}
