package com.qezy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qezy.dto.TestDto;
import com.qezy.model.cutomercontractinfo;




public interface TestRepo extends JpaRepository<cutomercontractinfo, Long>{
	
	
	@Query("select new com.qezy.dto.TestDto(c.deposit,d.logo, c.startdate) "
			+ "from cutomercontractinfo "
			+ "as c  Left join  CustomerInfo  as d on c.customerid = d.customerid")
	public List<TestDto> listOfcus();

}
