package com.example.accessingdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accessingdatarest.model.Tbl_Atmdtls;

@Repository
public interface Tbl_AtmdtlsRepository extends JpaRepository<Tbl_Atmdtls,Integer> {
	
}
