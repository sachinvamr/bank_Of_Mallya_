package com.example.accessingdatarest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingdatarest.model.Tbl_Atmdtls;
import com.example.accessingdatarest.repository.Tbl_AtmdtlsRepository;

@Service
public class Tbl_AtmdtlsRepositoryService {
	
	@Autowired
	Tbl_AtmdtlsRepository tbl_atmdtlsRepository;
	
	public List<Tbl_Atmdtls> getAllTbl() {
		tbl_atmdtlsRepository.save(new Tbl_Atmdtls(1,"12345",1234));
		return tbl_atmdtlsRepository.findAll();
	}
	
}
