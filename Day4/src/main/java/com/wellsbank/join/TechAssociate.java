package com.wellsbank.join;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "techAsso")
public class TechAssociate extends Educator{
	
	private int noOfLabs;

	public int getNoOfLabs() {
		return noOfLabs;
	}

	public void setNoOfLabs(int noOfLabs) {
		this.noOfLabs = noOfLabs;
	}
	
}
