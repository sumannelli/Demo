package com.qezy.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qezy.dto.testingDto;
import com.qezy.repository.TestingRepo;

@Service
public class TestingImpl {
	
	@Autowired
	TestingRepo repo;
	
	public List<testingDto> testingImpl(){
		
		return repo.testing();
	}
	

}
