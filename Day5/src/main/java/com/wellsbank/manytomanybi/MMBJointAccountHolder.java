package com.wellsbank.manytomanybi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "MMBjointAccountHolder")
public class MMBJointAccountHolder {

	@Id
	private int customerId;
	private String name;
	@ManyToMany(targetEntity = MMBAccount.class, cascade = CascadeType.ALL)
	@JoinTable(name = "MMBHolder")
	List<MMBAccount> account;
	
	
	
	public List<MMBAccount> getAccount() {
		return account;
	}
	public void setAccount(List<MMBAccount> account) {
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
	
	@Override
	public String toString() {
		return "MMBJointAccountHolder [customerId=" + customerId + ", name=" + name + ", account=" + account + "]";
	}
	
}
