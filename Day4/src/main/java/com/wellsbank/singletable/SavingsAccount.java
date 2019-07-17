package com.wellsbank.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SavingsAccount")
public class SavingsAccount extends Account{
	private int minBalance;
	private double interestRate;
	public int getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
