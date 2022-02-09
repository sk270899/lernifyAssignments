package com.pack1;

public class Employee {
	public int []arr = new int[5]; //instance array 
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.arr[0] = 99;
		emp1.arr[1] = 98;
		
		emp2.arr[2] = 97;
		emp2.arr[3] = 96;
		emp2.arr[4] = 95;
		
		for(int x:emp1.arr) {
			System.out.println(x);
		}
		for(int x:emp2.arr) {
			System.out.println(x);
		}
	}
}
