package com.collections;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<>();
		obj.add(123);
		obj.add(null);
		obj.add("sahil");
		obj.add(true);
		obj.add(45.0f);
		
		System.out.println(obj);
		System.out.println("by for loop :");
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		System.out.println("by for each loop :");
		for(Object i:obj) {
			System.out.println(i);
		}
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		
		System.out.println(num);
		System.out.println("by for loop :");
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i));
		}
		System.out.println("by for each loop :");
		for(Object i:num) {
			int x = (Integer)i;
			System.out.println(x);
		}
	}
}
