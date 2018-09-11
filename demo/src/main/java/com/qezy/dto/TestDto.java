package com.qezy.dto;

import javax.persistence.Column;

public class TestDto {

	private String deposit;
	private String logo;
	@Column(name = "start_date")
	private String startdate;
	
	public String getDeposit() {
		return deposit;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public TestDto(String deposit, String logo, String startdate) {
		super();
		this.deposit = deposit;
		
		this.startdate = startdate;
		this.logo = logo;
	}
	
	
	
}
