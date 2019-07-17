package com.wellsbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "CUST")
public class Customer {
	
	@Id
	int custId;
	
	@Column(name = "customername")
	String custName;

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
	
	@PrePersist
	public void beforePersist() {
		System.out.println("Call back method is executed before persisting");
	}
	
}
