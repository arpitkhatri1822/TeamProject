package com.mphasis.training.assignment.repository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

import com.mphasis.training.assignment.beans.Department;
import com.mphasis.training.assignment.beans.Employee;

public class EmployeeRepository {
	List<Employee> employees = null;

	public EmployeeRepository() {
		employees = new ArrayList<>();

		employees.add(new Employee(10101, "Arpit", "Khatri", "arpit@arpit.com", "321321654", LocalDate.of(2004, 05, 21),
				"Software Engineer", 40000, new Department(103, "Development", 1)));

		employees.add(new Employee(10102, "Supragna", "S", "sup@arpit.com", "311321654", LocalDate.of(2003, 06, 01),
				"CRO", 50000, new Department(102, "BOD", 1)));

		employees.add(new Employee(10103, "Shruti", "S", "shr@arpit.com", "331321654", LocalDate.of(2003, 05, 21),
				"CEO", 5000000, new Department(101, "BOD", 1)));

		employees.add(new Employee(10104, "Chandana", "S", "chan@arpit.com", "341321654", LocalDate.of(2010, 05, 21),
				"Tester", 20000, new Department(104, "Testing", 1)));

		employees.add(new Employee(10105, "Murali", "M", "murali@arpit.com", "361321654", LocalDate.of(2011, 05, 21),
				"Asso. Software Engineer", 25000, new Department(103, "Development", 1)));
	}

	public double getSalSum() { // 14.6

		double sum = 0;
		for (Employee e : employees) {
			sum += e.getSalary();
		}
		return sum;
	}

	/*
	 * public List<Employee> getDepEmpCount(){ //chandana
	 * 
	 * return null; }
	 * 
	 * public String seniorEmployee() { //shruti String senior = "";
	 * 
	 * return senior; }
	 */

	public List<String> getEmpDuration() { // 14.9
		List<String> emp = new ArrayList<>();
		for (Employee e : employees) {
			LocalDate ld = e.getDoj();
			LocalDate now = LocalDate.now();
			String name = e.getFname() + " " + e.getLname();

			Period p = Period.between(ld, now);
			int month = p.getMonths() + (p.getYears() * 12);
			int days = p.getDays();
			String dur = "Name: " + name + "Months: " + month + " Days: " + days + "\n";
			emp.add(dur);
		}
		return emp;
	}

	public List<String> getNhd() { // 14.13
		List<String> emp = new ArrayList<>();
		for (Employee employee : employees) {
			String name = employee.getFname() + " " + employee.getLname();
			LocalDate ld = employee.getDoj();
			DayOfWeek dow = ld.getDayOfWeek();
			String str = "Name: " + name + "Hire Date: " + ld + " DOW: " + dow;
			emp.add(str);
		}
		return emp;
	}
	
	

	public List<String> getNsInc() { // 14.16
		List<String> emp = new ArrayList<>();
		for (Employee employee : employees) {
			String name = employee.getFname() + " " + employee.getLname();
			double osal = employee.getSalary();
			double isal = osal * 1.5;
			String str = "Name: " + name + "Salary : " + osal + " Increased Salary: " + isal;
			emp.add(str);
		}
		return emp;
	}
	
	/*
	 *
	 * *** 14.19
	 * 
	 */

	public List<String> sortById() { //14.19
		List<String> emp = new ArrayList<>();
		Collections.sort(employees);
		for (Employee e : employees) {
			String str = e.getEmpid() + " " + e.getFname() + " " + e.getLname() + " " + e.getEmail() + " " + e.getMob()
					+ " " + e.getDoj() + " " + e.getDesignation() + " " + e.getSalary() + " "
					+ e.getDepartment().getDepId() + " " + e.getDepartment().getDepName() + " "
					+ e.getDepartment().getManagerId() + "\n";
			emp.add(str);
		}
		return emp;
	}

	public List<String> sortByDeptId() {
		List<String> emp = new ArrayList<>();

		Comparator<Employee> ecom1 = (Employee o1, Employee o2) -> {
			if (o1.getDepartment().getDepId() > o2.getDepartment().getDepId())
				return 1;
			else if (o1.getDepartment().getDepId() < o2.getDepartment().getDepId())
				return -1;
			else
				return 0;
		};

		Collections.sort(employees, ecom1);

		for (Employee e : employees) {
			String str = e.getEmpid() + " " + e.getFname() + " " + e.getLname() + " " + e.getEmail() + " " + e.getMob()
					+ " " + e.getDoj() + " " + e.getDesignation() + " " + e.getSalary() + " "
					+ e.getDepartment().getDepId() + " " + e.getDepartment().getDepName() + " "
					+ e.getDepartment().getManagerId() + "\n";
			emp.add(str);
		}
		return emp;
	}

	public List<String> sortByFname() {
		List<String> emp = new ArrayList<>();
		Comparator<Employee> ecom = Comparator.comparing(Employee::getFname);
		Collections.sort(employees, ecom);
		System.out.println("Employee sort based on the names:");
		for (Employee e : employees) {
			String str = e.getEmpid() + " " + e.getFname() + " " + e.getLname() + " " + e.getEmail() + " " + e.getMob()
					+ " " + e.getDoj() + " " + e.getDesignation() + " " + e.getSalary() + " "
					+ e.getDepartment().getDepId() + " " + e.getDepartment().getDepName() + " "
					+ e.getDepartment().getManagerId() + "\n";
			emp.add(str);
		}
		return emp;
	}
	public List<String> getAllEmployees(){
		List<String> emp = new ArrayList<>();
		for(Employee e:employees) {
			String str = e.getEmpid() + " " + e.getFname() + " " + e.getLname() + " " + e.getEmail() + " " + e.getMob()
			+ " " + e.getDoj() + " " + e.getDesignation() + " " + e.getSalary() + " "
			+ e.getDepartment().getDepId() + " " + e.getDepartment().getDepName() + " "
			+ e.getDepartment().getManagerId() + "\n";
		emp.add(str);
	}
		return emp;
	}
}
