package com.wrapper;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//auto-boxing
		
		int val = 100;
		Integer boxed = Integer.valueOf(val);
		System.out.println("Auto-Boxing : ");
		System.out.println("integer value: " + boxed + " is equal to int value: "+val + "\n");
		
		
		//auto-unboxing
		
		Integer exp = 199;
		int unBoxed = exp.intValue();
		System.out.println("Auto-UnBoxing : ");
		System.out.println("integer value: " + exp + "is equal to int value: "+unBoxed);
		
	}

}
