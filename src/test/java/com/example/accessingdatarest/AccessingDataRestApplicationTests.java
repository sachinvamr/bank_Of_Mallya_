package com.example.accessingdatarest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.accessingdatarest.model.Tbl_Atmdtls;
import com.example.accessingdatarest.repository.Tbl_AtmdtlsRepository;

@SpringBootTest
class AccessingDataRestApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	Tbl_AtmdtlsRepository tbl_atmdtlsRepository;
	
	@Test
	public void method1() {
		System.out.println("sachin");
		tbl_atmdtlsRepository.save(new Tbl_Atmdtls(1,"12345",1234));
		System.out.println(tbl_atmdtlsRepository.findAll());
		
	}

}
