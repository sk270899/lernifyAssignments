package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	int salary;
}

public class ArrayListKeyValuePair {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		List<Employee> li = new ArrayList<>();
		emp1.name = "sahil";
		emp1.salary = 10000;
		
		
		Predicate<Employee> pr = emp -> emp1.salary>7000;
		System.out.println(pr.test(emp1));
		
	}

}
