package com.example.accessingdatarest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_ACCOUNTS")
public class Tbl_Accounts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer AccTypeID;
	
	private String AccType;

	public Tbl_Accounts() {
		super();
	}

	public Integer getAccTypeID() {
		return AccTypeID;
	}

	public void setAccTypeID(Integer accTypeID) {
		AccTypeID = accTypeID;
	}

	public String getAccType() {
		return AccType;
	}

	public void setAccType(String accType) {
		AccType = accType;
	}
	
	
	
	
}
