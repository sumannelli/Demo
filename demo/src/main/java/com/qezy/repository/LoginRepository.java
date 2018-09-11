package com.qezy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qezy.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	
	List<Login>findByNameAndPassword(String name, String password);

}
