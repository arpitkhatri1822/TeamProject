package com.mphasis.training.assignment.view;

import java.util.List;

import com.mphasis.training.assignment.repository.EmployeeRepository;

public class EmployeeUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRepository e = new EmployeeRepository();
		
		List<String> duration = e.getEmpDuration();
		System.out.println(duration);
		
		List<String> var = e.sortById();
		System.out.println(var+"\n\n\n");
		
		List<String> var2 = e.sortByDeptId();
		System.out.println(var2+"\n\n\n");
		
		List<String> var3 = e.sortByFname();
		System.out.println(var3+"\n\n\n");
		
		
	}

}
