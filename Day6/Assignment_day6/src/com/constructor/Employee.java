package com.constructor;

public class Employee {
	int empid;
	String empname;
	
	void setData(int id, String name) {
		this.empid = id;
		this.empname = name;
	}
	
	void viewData() {
		System.out.println("name : "+this.empname+" and id : "+this.empid);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setData(121, "sahil");
		emp.viewData();
	}
}
