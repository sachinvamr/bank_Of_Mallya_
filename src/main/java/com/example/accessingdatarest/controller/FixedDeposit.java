package com.example.accessingdatarest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingdatarest.model.Tbl_Atmdtls;
import com.example.accessingdatarest.service.Tbl_AtmdtlsRepositoryService;

@RestController
public class FixedDeposit {
	
	@Autowired
	Tbl_AtmdtlsRepositoryService tbl_atmdtlsRepositoryService;
	
	@GetMapping("test1")
	public List<Tbl_Atmdtls> temp1(){
		
		return  tbl_atmdtlsRepositoryService.getAllTbl();
	}
	
}
