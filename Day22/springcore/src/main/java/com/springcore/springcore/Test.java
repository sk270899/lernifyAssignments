package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);
		Employee emp =(Employee) factory.getBean("employee");
		emp.setEmpName("sahil");
		emp.setEmpId(121);
		emp.setEmpSal(10000);
		Address add =(Address) factory.getBean("address");
		add.setHouseNo(111);
		add.setColonyName("krishna colony");
		add.setDistrictName("jaipur");
		add.setStateName("rajasthan");
		emp.setAddress(add);
		System.out.println(emp);
	}
}
