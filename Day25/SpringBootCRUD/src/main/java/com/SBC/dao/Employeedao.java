package com.SBC.dao;

import org.springframework.data.repository.CrudRepository;

import com.SBC.entity.Employee;

public interface Employeedao extends CrudRepository<Employee, Integer>{

}
