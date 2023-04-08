package com.application.oneestore.entites;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Discount {
	
	private long discount_ID;
	private String discount_code;
	private double discount_amt;
	private Date start_date;
	private Date end_Date;
	private double min_purchase_amt;
	
	@Column(columnDefinition = "VARCHAR(10) DEFAULT 'NULL'")
	@Enumerated(EnumType.STRING)
	private DiscountType discount_type;

	public Discount(long discount_ID, String discount_code, double discount_amt, Date start_date, Date end_Date,
			double min_purchase_amt, DiscountType discount_type) {
		super();
		this.discount_ID = discount_ID;
		this.discount_code = discount_code;
		this.discount_amt = discount_amt;
		this.start_date = start_date;
		this.end_Date = end_Date;
		this.min_purchase_amt = min_purchase_amt;
		this.discount_type = discount_type;
	}

	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Discount [discount_ID=" + discount_ID + ", discount_code=" + discount_code + ", discount_amt="
				+ discount_amt + ", start_date=" + start_date + ", end_Date=" + end_Date + ", min_purchase_amt="
				+ min_purchase_amt + ", discount_type=" + discount_type + "]";
	}
	
	
	
}
