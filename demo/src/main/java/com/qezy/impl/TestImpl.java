package com.qezy.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qezy.dto.TestDto;
import com.qezy.repository.TestRepo;

@Service
public class TestImpl {
	
	@Autowired
	TestRepo repo;
	
	public List<TestDto> test(){
	List<TestDto> dt = repo.listOfcus();
	return dt;
	}
	

}
