package com.wellsbank.jpql;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "jpqldept")
public class jpqldept {
	@Id
	private int deptNo;
	private String dName;
	private String loc;

	/*
	 * @OneToMany(mappedBy = "dept", targetEntity = jpqlEmployee.class)
	 * List<jpqlEmployee> employee;
	 */
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	/*
	 * public List<jpqlEmployee> getEmployee() { return employee; } public void
	 * setEmployee(List<jpqlEmployee> employee) { this.employee = employee; }
	 */
	
}
