package com.exceptions;


class MyExceptions extends Exception {
	private int marks;
	public MyExceptions(int marks) {
		this.marks=marks;
	}
	
	public String toString() {
		return "you are a front bencher";
	}
}
public class UserDefinedExceptions {

	static  void backBencher(int marks) throws MyExceptions {
    	if (marks>65)
    		throw new MyExceptions(marks);
    	else
    		System.out.println("you are eleible for back bencher group : "+marks);
    }
	public static void main(String[] args) throws MyExceptions {
		UserDefinedExceptions.backBencher(45);
	}

}
