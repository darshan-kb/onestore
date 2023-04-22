package com.application.oneestore.entites;

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
public class ShippingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long shipping_ID;

	private String last_name;
	private String first_name;
	private String phone_no;
	private String shipping_address;
	private String city;
	private String state;
	private String country;
	
	//use customer_id while sending the data
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "customer_id")
	private Customers customer;
	
	@OneToMany(mappedBy = "order_ID", cascade=CascadeType.ALL)
	private List<Orders> orders;
	
	public ShippingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShippingDetails(long shipping_ID, Customers customer, String last_name, String first_name, String phone_no,
			String shipping_address, String city, String state, String country, List<Orders> orders) {
		super();
		this.shipping_ID = shipping_ID;
		this.customer = customer;
		this.last_name = last_name;
		this.first_name = first_name;
		this.phone_no = phone_no;
		this.shipping_address = shipping_address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.orders = orders;
	}
	public long getShipping_ID() {
		return shipping_ID;
	}
	public void setShipping_ID(long shipping_ID) {
		this.shipping_ID = shipping_ID;
	}
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "ShippingDetails [shipping_ID=" + shipping_ID + ", customer=" + customer + ", last_name=" + last_name
				+ ", first_name=" + first_name + ", phone_no=" + phone_no + ", shipping_address=" + shipping_address
				+ ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
	
}
