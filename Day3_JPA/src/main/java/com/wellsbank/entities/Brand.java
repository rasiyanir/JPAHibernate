package com.wellsbank.entities;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Brand {
	@Id
	private int brandid;
	private String brandname;
	//@Temporal(TemporalType.DATE)
	private Calendar dateoflaunch;
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public Calendar getDateoflaunch() {
		return dateoflaunch;
	}
	public void setDateoflaunch(Calendar dateoflaunch) {
		this.dateoflaunch = dateoflaunch;
	}
	
	
}
