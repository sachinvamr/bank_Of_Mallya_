package com.example.accessingdatarest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_ATMDTLS")
public class Tbl_Atmdtls {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String AccountNumber;
	
	private int Atmpin;
	
	public Tbl_Atmdtls() {
		super();
	}

	public Tbl_Atmdtls(Integer id, String accountNumber, int atmpin) {
		super();
		this.id = id;
		AccountNumber = accountNumber;
		Atmpin = atmpin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public int getAtmpin() {
		return Atmpin;
	}

	public void setAtmpin(int atmpin) {
		Atmpin = atmpin;
	}

	
	
	

}
