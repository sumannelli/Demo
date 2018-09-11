package com.qezy.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qezy.dto.TestDto;
import com.qezy.dto.listOfManageCustomers;
import com.qezy.dto.testingDto;
import com.qezy.exception.ResourceNotFoundException;
import com.qezy.impl.LoginImpl;
import com.qezy.impl.TestImpl;
import com.qezy.impl.TestingImpl;
import com.qezy.impl.listOfCustomersImpl;
import com.qezy.model.Login;
@RestController
@RequestMapping("/api")
public class RestServices {
	
	@Autowired
	LoginImpl login;
	
	@Autowired
	listOfCustomersImpl listOf;
	

	
	@Autowired
	TestImpl impl;
	

	@RequestMapping("/tt")
	public String test2() {
		return "Helo String2";
	}
	
	
	@PostMapping("/login")
	public Object login(@RequestParam("name") String name, @RequestParam("password")  String password){
		String msg = "";
		List<Login> result = login.getValiodation(name, password);
		
		
			if (result.size() == 0) {
				//Throw(() -> new ResourceNotFoundException("Note", "id", name));
				
				throw new ResourceNotFoundException("user", "name", name);
				
			}else {
				msg = "You are successfully logged in";
			}
		
		return msg;
		
	}
	
	@GetMapping("/list")
	public List<listOfManageCustomers> list() {
		
		List<listOfManageCustomers> obj = listOf.list();
		return obj;
		
	}
	
	@GetMapping("/testing")
	public List<TestDto> test(){
		List<TestDto> dt = impl.test();
		return dt;
	}
	
	@RequestMapping("/security")
	public String spring() {
		return "welcome to security";
	}
	
	
	@RequestMapping("/sec")
	public String userValidation() {
		
		return "User:successfully login completed";
	}

}
