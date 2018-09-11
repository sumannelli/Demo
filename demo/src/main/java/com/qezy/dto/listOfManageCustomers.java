package com.qezy.dto;

import java.io.Serializable;

public class listOfManageCustomers implements Serializable {
	
	
	/**
	 * 
	 */

	
	private String logo;
	private int id;
	private String customerid;
	private String name;
	private String country;
	private String createdtime;
	private String activestatus;
	private String startdate;
	private String enddate;
	private String deposit;
	private String address1;
	private String address2;
	private String state;
	private String city;
	private String zip;
	private String phone;
	private String email;
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(String createdtime) {
		this.createdtime = createdtime;
	}
	public String getActivestatus() {
		return activestatus;
	}
	public void setActivestatus(String activestatus) {
		this.activestatus = activestatus;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public listOfManageCustomers(String logo, int id, String customerid, String name, String country,
			String createdtime, String activestatus,  String address1,
			String address2, String state, String city, String zip, String phone, String email, 
			
			String startdate, String enddate, String deposit
			) {
		super();
		this.logo = logo;
		this.id = id;
		this.customerid = customerid;
		this.name = name;
		this.country = country;
		this.createdtime = createdtime;
		this.activestatus = activestatus;
		this.startdate = startdate;
		this.enddate = enddate;
		this.deposit = deposit;
		this.address1 = address1;
		this.address2 = address2;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}

	

}
