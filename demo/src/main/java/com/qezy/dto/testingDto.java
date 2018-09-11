package com.qezy.dto;

public class testingDto {
	
	private String customerid;
	private String name;
	private String link;
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public testingDto(String customerid, String name, String link) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.link = link;
	}
	
	

}
