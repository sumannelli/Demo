package com.qezy.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qezy.model.Login;
import com.qezy.repository.LoginRepository;

@Service
public class LoginImpl {
	
	@Autowired
	LoginRepository login;
	
	public List<Login>  getValiodation(String name, String password){
		
		List<Login> al = login.findByNameAndPassword(name, password);
		
		return al;
	}

}
