package com.wellsbank.manytomanybi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MMBAccount")
public class MMBAccount {

	@Id
	private int accountId;
	private double balance;
	@ManyToMany(targetEntity = MMBJointAccountHolder.class, mappedBy = "account")
	List<MMBJointAccountHolder> joint;
	
	
	public List<MMBJointAccountHolder> getJoint() {
		return joint;
	}
	public void setJoint(List<MMBJointAccountHolder> joint) {
		this.joint = joint;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "MMBAccount [accountId=" + accountId + ", balance=" + balance + ", joint=" + joint + "]";
	}
	
	
}
