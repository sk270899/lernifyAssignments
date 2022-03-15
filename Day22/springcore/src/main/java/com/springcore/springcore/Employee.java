package com.springcore.springcore;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empId;
	private String empName;
	private int empSal;
	Address address;
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, int empSal, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", address=" + address
				+ "]";
	}
	
	
	
}
