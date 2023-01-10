package com.customer.entity;

public class CustomerInfo {

	private String firstName ;
	private String lastName ;
	private String userName ;
	private String email ;
	private String address ;
	private String address2 ;
	private String city ;
	private String state ;
	private String pin ;
	private int AccountNumber;
	
	
	public CustomerInfo(String firstName, String lastName, String userName, String email, String address,
			String address2, String city, String state, String pin, int accountNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.AccountNumber = accountNumber;
	}


	public CustomerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
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


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}


	public int getAccountNumber() {
		return AccountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	
	
	
	
	
	
	
}