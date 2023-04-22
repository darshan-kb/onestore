package com.application.oneestore.entites;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long order_ID;
	
	@ManyToOne
	@JoinColumn(name = "customer_ID")
	private Customers customer;
	
	private Date order_date;
	private double total_price;
	private OrderStatus orderstatus;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "discount_ID")
	private Discount discount;
	
	@OneToMany(mappedBy = "orderitems_ID", cascade = CascadeType.ALL)
	private List<OrderItems> orderitems;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "shipping_ID")
	private ShippingDetails shippingdetails;
}
