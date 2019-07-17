package com.wellsbank.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "jointAccountHolder")
public class JointAccountHolder {

	@Id
	private int customerId;
	private String name;
	@ManyToMany(targetEntity = MMAccount.class, cascade = CascadeType.ALL)
	@JoinTable(name = "Holder")
	List account;
	
	
	public List<MMAccount> getAccount() {
		return account;
	}
	public void setAccount(List<MMAccount> account) {
		this.account = account;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
