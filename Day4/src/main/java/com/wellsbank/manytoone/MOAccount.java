package com.wellsbank.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MOAccount")
public class MOAccount {

	@Id
	private int accountId;
	private String accountType;
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "customerId")
	MOCustomer customer;
	public MOCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(MOCustomer customer) {
		this.customer = customer;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
}
