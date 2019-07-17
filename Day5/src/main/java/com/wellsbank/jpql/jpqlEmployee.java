package com.wellsbank.jpql;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jpqlemployee")
public class jpqlEmployee {
	@Id
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private String hireDate;
	private int sal;
	private int comm;
	private int deptNo;
	/*
	 * @ManyToOne(cascade = CascadeType.ALL, targetEntity = jpqldept.class)
	 * 
	 * @JoinColumn(name = "deptNo") jpqldept dept;
	 */
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	/*
	 * public jpqldept getDept() { return dept; } public void setDept(jpqldept dept)
	 * { this.dept = dept; }
	 */
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	
	
}
