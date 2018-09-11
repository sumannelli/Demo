package com.qezy.repository;


	
	


	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qezy.dto.testingDto;
import com.qezy.model.CustomerInfo;




	@Repository
	public interface TestingRepo extends JpaRepository<CustomerInfo, Long>{
		
		
		@Query("select new com.qezy.dto.testingDto (a.customerid, a.name , b.link) from CustomerInfo as a INNER JOIN channelinfo as b on a.name = b.name ")
	
		public List<testingDto> testing();

	


}
