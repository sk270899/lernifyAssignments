package com.SBC.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SBC.entity.Employee;
import com.SBC.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	
	//post-->insert, get-->get, put-->update, delete-->remove
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	
	@GetMapping("/getEmployee/{eid}")
	public Optional<Employee> getEmployee(@PathVariable("eid") int empId) {
		return service.getEmployee(empId);
	}
	
	@GetMapping("/getAllEmployee")
	public Iterable<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
	
	@DeleteMapping("/deleteEmployee/{eid}")
	public void deleteEmployee(@PathVariable("eid") int empId) {
		service.deleteEmployee(empId);
	}
}
