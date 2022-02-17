//create a class with Marks, and valid Marks method, 
//give some number marks are less than he/she fails otherwise pass by using throw keyword.

package com.exceptions;

public class MarksPassOrFail {
	public void pass(int marks) {
		if (marks<35)
			throw new ArithmeticException("you are failed");
		else {
			System.out.println("you are passed, marks = "+marks);
		}
	}
	public static void main(String[] args) {
		try {
			MarksPassOrFail t= new MarksPassOrFail();
			t.pass(12);
			
		}
		catch (Exception t) {
			System.out.println("exception cought");
		}
		System.out.println("Rest of the code. ");
	}

}
