package com.employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Employee {
	
	private int id;
	private String name; 
	private int salary; 
	private int code; 
	private String address; 
	private int pincode;
	
	static Scanner sc = new Scanner(System.in);
	
	Employee() {}
	Employee(int id, String name, int salary, int code, String address, int pincode) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.code = code;
		this.address = address;
		this.pincode = pincode;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", code=" + code + ", address="
				+ address + ", pincode=" + pincode + "]";
	}



	static HashMap<Integer,Employee> database = new HashMap<>();
	
	
	public static void addEmployee(Employee Employee) {
		
		database.put(Employee.id, Employee);
	}
	
	public static void updateEmployee(int id) {
		Employee myEmployee = new Employee();
		myEmployee = database.get(id);
		System.out.println("what you want to update in " + myEmployee.name + " ??");
		System.out.println(	"1. Update name" 
							+ "\n" + "2. Update salary" 
							+ "\n" + "3. Update Employee code" 
							+ "\n" + "4. Update address" 
							+ "\n" + "5. Update pincode" 
							+ "\n" + "You can't change Employee id.");
		
		System.out.println("Enter numeric input : ");
		int update = sc.nextInt();
		switch (update) {
		case 1: {
			System.out.println("Enter new name for Employee : ");
			myEmployee.name = sc.next();
			System.out.println("Updated new name to " + myEmployee.name);
			break;
		}
		case 2: {
			System.out.println("Enter new salary for Employee : ");
			myEmployee.salary = sc.nextInt();
			System.out.println("Updated new salary to " + myEmployee.salary);
			break;
		}
		case 3: {
			System.out.println("Enter new code for Employee : ");
			myEmployee.code = sc.nextInt();
			System.out.println("Updated new code to " + myEmployee.code);
			break;
		}
		case 4: {
			System.out.println("Enter new address for Employee : ");
			myEmployee.address = sc.next();
			System.out.println("Updated new address to " + myEmployee.address);
			break;
		}
		case 5: {
			System.out.println("Enter new pincode for Employee : ");
			myEmployee.pincode = sc.nextInt();
			System.out.println("Updated new pincode to " + myEmployee.pincode);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + update);
		}
	}
	
	public static void deleteEmployee(int id) {
		database.remove(id);
		System.out.println("Employee deleted successfully...");
	}
	
	
	public static void getEmployee(int id) {
		System.out.println(database.get(id).toString());
	}
	
	public static void getAllEmployees() {
		Set<Entry<Integer,Employee>> result=database.entrySet();
 	   	Iterator<Entry<Integer,Employee>> itr=result.iterator();
 	   	while(itr.hasNext()) {
 	   		System.out.println(itr.next().toString());
 	   	}
	}
	public static void main(String[] args) {
		System.out.println("What you want to do ??");
		System.out.println("Enter 1 to continue : ");
		Scanner sc = new Scanner(System.in);
		int continueOrNot = sc.nextInt();
		while(continueOrNot == 1) {
			System.out.println(	"1. Add Employee" 
					+ "\n" + "2. Update Employee" 
					+ "\n" + "3. Delete Employee" 
					+ "\n" + "4. Get Employee" 
					+ "\n" + "5. Get All Employee" );
			System.out.println("Enter numeric value : ");
			int x = sc.nextInt();
			
			switch (x) {
			case 1: {
				System.out.println("Enter details : ");
				int id;
				String name; 
				int salary; 
				int code; 
				String address; 
				int pincode;
				
				System.out.println("Enter the id of Employee : ");
				id = sc.nextInt();
				System.out.println("Enter Employee name : ");
				name = sc.next();
				System.out.println("Enter salary of Employee : ");
				salary = sc.nextInt();
				System.out.println("Enter Employee code : ");
				code = sc.nextInt();
				System.out.println("Enter address : ");
				address = sc.next();
				System.out.println("Enter pin code : ");
				pincode = sc.nextInt();
				
				Employee myEmployee = new Employee(id, name, salary, code, address, pincode);
				addEmployee(myEmployee);
				System.out.println("Employee added Successfully...");
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			case 2: {
				System.out.println("Enter Employee id to update : ");
				int updateId = sc.nextInt();
				updateEmployee(updateId);
				System.out.println("Employee updated successfully...");
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			case 3: {
				System.out.println("Enter Employee id to delete : ");
				int deleteId = sc.nextInt();
				deleteEmployee(deleteId);
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			case 4: {
				System.out.println("Enter Employee id to get Employee : ");
				int getId = sc.nextInt();
				getEmployee(getId);
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			case 5: {
				getAllEmployees();
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + x);
			}
		}
		sc.close();
		
	}

}


//-----------Output--------------
/*
  
  
What you want to do ??
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
1
Enter details : 
Enter the id of Employee : 
101
Enter Employee name : 
sahil
Enter salary of Employee : 
10000
Enter Employee code : 
1518
Enter address : 
alwar
Enter pin code : 
301001
Employee added Successfully...
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
1
Enter details : 
Enter the id of Employee : 
102
Enter Employee name : 
ishika
Enter salary of Employee : 
5000
Enter Employee code : 
0900
Enter address : 
alwawr
Enter pin code : 
301001
Employee added Successfully...
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
2
Enter Employee id to update : 
102
what you want to update in ishika ??
1. Update name
2. Update salary
3. Update Employee code
4. Update address
5. Update pincode
You can't change Employee id.
Enter numeric input : 
4
Enter new address for Employee : 
alwar
Updated new address to alwar
Employee updated successfully...
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
5
101=Employee [id=101, name=sahil, salary=10000, code=1518, address=alwar, pincode=301001]
102=Employee [id=102, name=ishika, salary=5000, code=900, address=alwar, pincode=301001]
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
3
Enter Employee id to delete : 
102
Employee deleted successfully...
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
5
101=Employee [id=101, name=sahil, salary=10000, code=1518, address=alwar, pincode=301001]
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
1
Enter details : 
Enter the id of Employee : 
102
Enter Employee name : 
sathya
Enter salary of Employee : 
100000
Enter Employee code : 
2191
Enter address : 
jaipur
Enter pin code : 
302017
Employee added Successfully...
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
4
Enter Employee id to get Employee : 
102
Employee [id=102, name=sathya, salary=100000, code=2191, address=jaipur, pincode=302017]
Enter 1 to continue : 

1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
5
101=Employee [id=101, name=sahil, salary=10000, code=1518, address=alwar, pincode=301001]
102=Employee [id=102, name=sathya, salary=100000, code=2191, address=jaipur, pincode=302017]
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
5
101=Employee [id=101, name=sahil, salary=10000, code=1518, address=alwar, pincode=301001]
102=Employee [id=102, name=sathya, salary=100000, code=2191, address=jaipur, pincode=302017]
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
2
Enter Employee id to update : 
102
what you want to update in sathya ??
1. Update name
2. Update salary
3. Update Employee code
4. Update address
5. Update pincode
You can't change Employee id.
Enter numeric input : 
2
Enter new salary for Employee : 
500000
Updated new salary to 500000
Employee updated successfully...
Enter 1 to continue : 
1
1. Add Employee
2. Update Employee
3. Delete Employee
4. Get Employee
5. Get All Employee
Enter numeric value : 
5
101=Employee [id=101, name=sahil, salary=10000, code=1518, address=alwar, pincode=301001]
102=Employee [id=102, name=sathya, salary=500000, code=2191, address=jaipur, pincode=302017]
Enter 1 to continue : 
0
*/

