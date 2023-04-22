package com.application.oneestore.entites;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderitems_ID;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "order_ID")
	private Orders order;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "product_ID")
	private Products product;
	
	private int quantity;
	private double priceperunit;
}
