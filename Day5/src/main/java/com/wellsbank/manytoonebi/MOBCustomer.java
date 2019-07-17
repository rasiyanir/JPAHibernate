package com.wellsbank.manytoonebi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "MOBcustomer")
public class MOBCustomer {

	@Id
	private int custId;
	private String custName;
	@OneToMany(mappedBy = "customer", targetEntity = MOBAccount.class)
	List<MOBAccount> account;
	
	public List<MOBAccount> getAccount() {
		return account;
	}
	public void setAccount(List<MOBAccount> account) {
		this.account = account;
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
