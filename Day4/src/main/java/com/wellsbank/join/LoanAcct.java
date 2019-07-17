package com.wellsbank.join;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LoanAccount")
public class LoanAcct extends Acct{
	private double loanAmount;

	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	
	
}
