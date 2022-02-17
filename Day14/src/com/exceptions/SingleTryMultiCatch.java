package com.exceptions;

public class SingleTryMultiCatch {

	public static void main(String[] args) {
		try {
			int a[]= new int[5];
			a[5]=100/0;
			String s= "000";
			System.out.println(s.length());
			int x= Integer.parseInt(s);
			System.out.println("no error  "+a[4]+"  "+x);
			
			}
			catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("Error : Array Index out of bounds");
			}
			catch(ArithmeticException ae) {
				System.out.println("Error : divide by zero");
			}
			catch (NumberFormatException e) {
			System.out.println("Error : String to number conversion not Possible");
			}
			catch(Exception ae) {
				System.out.println("Error : length of String can't be defined");
			}
			finally {
				System.out.println("final block");
			}
			System.out.println("Hello World !");
		}
	}
