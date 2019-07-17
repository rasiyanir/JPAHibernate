package com.wellsbank.manytoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MOBAccount")
public class MOBAccount {

	@Id
	private int accountId;
	private String accountType;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = MOBCustomer.class)
	@JoinColumn(name = "customerId")
	MOBCustomer customer;
	public MOBCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(MOBCustomer customer) {
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
