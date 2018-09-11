package com.qezy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qezy.dto.listOfManageCustomers;
import com.qezy.model.CustomerInfo;
@Repository
public interface listOfCustomerRepo extends JpaRepository<CustomerInfo, Long> {

	@Query(
			"SELECT new com.qezy.dto.listOfManageCustomers"
			+ "(ci.logo, ci.id , ci.customerid ,ci.name ,  ci.country , ci.createdtime , "
			+ "ci.activestatus, \n" + 
			" ci.address1 ,\n" + 
			"ci.address2 , ci.state ,ci.city , ci.zip , ci.phone , ci.email,cc.startdate ,"
			+ " cc.enddate ,cc.deposit   ) FROM CustomerInfo as  ci \n" + 
			"  LEFT  JOIN cutomercontractinfo as cc ON ci.customerid = cc.customerid  ")
	
	
	public List<listOfManageCustomers> listOfCustomers();
	
	//WHERE ci.deletestatus = 0 ORDER BY ci.name
}
