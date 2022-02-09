package com.constructor;

public class Student {
	int studentId;
	String studentName;
	
	Student() {
		studentName = "sahil";
		studentId = 121;
		System.out.println(studentName);
		System.out.println(studentId);
	}
	
	void setValue() {
		this.studentName = "abcd";
		this.studentId = 212;
		System.out.println(studentName);
		System.out.println(studentId);
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.setValue();
	}
}
