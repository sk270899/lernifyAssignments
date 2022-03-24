package com.SBC.service;

import java.util.Optional;

import com.SBC.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(int empId);

	Optional<Employee> getEmployee(int empId);

	Iterable<Employee> getAllEmployees();

}
