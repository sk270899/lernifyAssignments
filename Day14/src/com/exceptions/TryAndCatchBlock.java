package com.exceptions;

import java.util.Scanner;

public class TryAndCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int z = a/b;
			System.out.println(z);
		}
		catch (ArithmeticException e) {
			System.out.println("divide by zero exception occured.");
		}
	}

}
