package com.application.oneestore.model;

public class Customer {
	private String firstname;
	private String lastname;
	private String email;
	private String phone_no;
	private String billing_address;
	public Customer(String firstname, String lastname, String email, String phone_no, String billing_addresss) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone_no = phone_no;
		this.billing_address = billing_address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getBilling_address() {
		return billing_address;
	}
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	
}
