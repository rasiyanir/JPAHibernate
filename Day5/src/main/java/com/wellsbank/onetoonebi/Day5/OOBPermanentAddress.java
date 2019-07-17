package com.wellsbank.onetoonebi.Day5;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OOBPermanantAddress")
public class OOBPermanentAddress {
	
	@Id
	private int doorNo;
	private String state;
	@OneToOne(mappedBy = "permanentAddress")
	OOBCustomer customer;
	
	public OOBCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(OOBCustomer customer) {
		this.customer = customer;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "PermanentAddress [doorNo=" + doorNo + ", state=" + state + ", customer=" + customer + "]";
	}
	
	
}
