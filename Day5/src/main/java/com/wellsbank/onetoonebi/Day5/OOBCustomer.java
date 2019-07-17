package com.wellsbank.onetoonebi.Day5;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OOBCustomer")
public class OOBCustomer {
	
	@Id
	private int custId;
	private String custName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doorNo")
	OOBPermanentAddress permanentAddress;
	
	
	public OOBPermanentAddress getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(OOBPermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
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
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", permanentAddress=" + permanentAddress + "]";
	}
	
	
	
}
