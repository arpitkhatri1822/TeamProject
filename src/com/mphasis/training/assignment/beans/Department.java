package com.mphasis.training.assignment.beans;

public class Department{
	
	private int depId;
	private String depName;
	private int managerId;
	
	
	public Department(int depId, String depName, int managerId) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.managerId = managerId;
	}
	
	public int getDepId() {
		return depId;
	}
	public String getDepName() {
		return depName;
	}	
	public int getManagerId() {
		return managerId;
	}

	
	

}
