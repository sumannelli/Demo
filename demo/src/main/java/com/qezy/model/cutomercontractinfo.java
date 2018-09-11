package com.qezy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_contract_info")
public class cutomercontractinfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	//private String customerid;
	
	@Column(name = "customer_id")
	private String customerid;
	
	
	private String deposit;
	
	
	@Column(name = "start_date")
	private String startdate;
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	@Column(name = "end_date")
	private String enddate;
	private String contractno;
	public int getId() {
		return id;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}*/
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
	public String getContractno() {
		return contractno;
	}
	public void setContractno(String contractno) {
		this.contractno = contractno;
	}
	
	

}
