package com.reviews.entities;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@EntityListeners(ProjectListener.class)
public class Project {
	
	@Id
	int projectId;
	@Temporal(TemporalType.DATE)		//--Ans1
	Calendar dateOfCreation;
	String pName;
	@Transient
	int versionNumber;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public Calendar getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Calendar dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
}
