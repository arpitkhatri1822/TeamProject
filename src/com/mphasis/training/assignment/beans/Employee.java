package com.mphasis.training.assignment.beans;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee  implements Serializable, Comparable<Employee>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empid;
	private String fname;	
	private String lname;
	private String email;
	private String mob;
	private LocalDate doj;
	private String designation;
	private double salary;
	private int managerId;
	Department department;
	
	public Employee(int empid, String fname, String lname, String email, String mob, LocalDate doj, String designation,
			double salary, Department department) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mob = mob;
		this.doj = doj;
		this.designation = designation;
		this.salary = salary;
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getEmail() {
		return email;
	}
	public String getMob() {
		return mob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}

	public int getManagerId() {
		return managerId;
	}
	
	public Department getDepartment() {
		return department;
	}
	@Override
	public int compareTo(Employee e) {
		if(empid < e.getEmpid())return -1;
		else if(empid > e.getEmpid()) return 1;
		else
			return 0;
	}

	//private int managerId=department.getManagerId();
	
	/*public int getManagerId() {
		return managerId;
	}
	*/
	

}
