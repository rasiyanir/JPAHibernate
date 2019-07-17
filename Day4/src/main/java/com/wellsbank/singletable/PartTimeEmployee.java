package com.wellsbank.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Part Time")
public class PartTimeEmployee extends Employee {
		
	private int wages;

	public int getWages() {
		return wages;
	}

	public void setWages(int wages) {
		this.wages = wages;
	}
	
}
