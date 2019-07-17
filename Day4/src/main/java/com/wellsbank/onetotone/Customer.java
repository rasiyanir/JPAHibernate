package com.wellsbank.onetotone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer {
	@Id
	private int custId;
	private String custName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doorNo")
	PermanentAddress address;
	public PermanentAddress getAddress() {
		return address;
	}
	public void setAddress(PermanentAddress address) {
		this.address = address;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
}
