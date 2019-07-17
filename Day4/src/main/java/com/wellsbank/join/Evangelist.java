package com.wellsbank.join;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "evange")
public class Evangelist extends Educator{
	private int noOfSession;

	public int getNoOfSession() {
		return noOfSession;
	}

	public void setNoOfSession(int noOfSession) {
		this.noOfSession = noOfSession;
	}
	
}
