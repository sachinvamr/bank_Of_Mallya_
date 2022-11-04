package com.example.accessingdatarest.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.accessingdatarest.model.Tbl_Atmdtls;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tbl_AtmdtlsRepositoryDemo {
	
	@Autowired
	Tbl_AtmdtlsRepository tbl_atmdtlsRepository;
	
	@Test
	public void method1() {
		System.out.println("sachin");
		tbl_atmdtlsRepository.save(new Tbl_Atmdtls(1,"12345",1234));
		
	}
	
	
	
}
