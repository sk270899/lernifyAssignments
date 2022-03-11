package com.employeecrud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sahil");
		
		EntityManager entity=factory.createEntityManager(); 
		
		//persist()-->save or insert, merge()-->update, remove()-->delete, find()==>select fetch
		
		
		Employee emp= new Employee(124, "sahil", 100000, "del");
		Employee e= new Employee(100, "dIVYA", 10000, "KNL");
		Employee e1= new Employee(101, "TARUN", 12000, "KURNOOL");
		Employee e2= new Employee(102, "SATHYA", 13000, "HYD");
		Employee e3= new Employee(103, "MAHESH", 14000, "KMPL");
		
		
		entity.getTransaction().begin();
		
		entity.persist(emp);
		entity.persist(e);
		entity.persist(e1);
		entity.persist(e2);
		entity.persist(e3);
		
		
		Query tq=entity.createQuery("select e from Employee e", Employee.class);
		
		@SuppressWarnings("unchecked")
		List<Employee> li=tq.getResultList();
				
		for(Employee s:li) 
		{
			System.out.println(s.getEmpid() + " " + s.getEmpname() + " " + s.getEmpsal());
		}
	
		entity.getTransaction().commit();
		
	}

}