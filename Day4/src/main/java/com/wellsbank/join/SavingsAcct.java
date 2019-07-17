package com.wellsbank.join;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SavingsAccount")
public class SavingsAcct extends Acct{
	private int minBalance;

	public int getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	
}
