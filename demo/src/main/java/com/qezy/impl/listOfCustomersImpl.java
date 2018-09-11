package com.qezy.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qezy.dto.listOfManageCustomers;
import com.qezy.repository.listOfCustomerRepo;


@Service
public class listOfCustomersImpl {
	
	@Autowired
	listOfCustomerRepo repo;
	
	public List<listOfManageCustomers> list(){
		
		List<listOfManageCustomers> obj= repo.listOfCustomers();
		
		
		return obj;
	}
	

}
