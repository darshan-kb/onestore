package com.application.oneestore.entites;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customer_ID;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_no;
	private String biling_address;
	
	@OneToMany(mappedBy = "order_ID", cascade = CascadeType.ALL)
	private List<Orders> orders;
	
	@OneToMany(mappedBy = "shipping_ID", cascade=CascadeType.ALL)
	private List<ShippingDetails> shippingdetails;
	
	
	
	public Customers(long customer_ID, String first_name, String last_name, String email, String phone_no,
			String biling_address, List<Orders> orders, List<ShippingDetails> shippingdetails) {
		super();
		this.customer_ID = customer_ID;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_no = phone_no;
		this.biling_address = biling_address;
		this.orders = orders;
		this.shippingdetails = shippingdetails;
	}

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public List<ShippingDetails> getShippingdetails() {
		return shippingdetails;
	}
	public void setShippingdetails(List<ShippingDetails> shippingdetails) {
		this.shippingdetails = shippingdetails;
	}
	public long getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(long customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getBiling_address() {
		return biling_address;
	}
	public void setBiling_address(String biling_address) {
		this.biling_address = biling_address;
	}

	@Override
	public String toString() {
		return "Customers [customer_ID=" + customer_ID + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_no=" + phone_no + ", biling_address=" + biling_address + ", orders="
				+ orders + ", shippingdetails=" + shippingdetails + "]";
	}
	
	
}
