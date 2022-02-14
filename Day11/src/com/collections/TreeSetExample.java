package com.collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> ts = new TreeSet<>();
		
		ts.add(100);
		ts.add(123);
//		ts.add(null);  ERROR
//		ts.add("sahil");  ERROR
//		ts.add(true);  ERROR
//		ts.add(45.0f);  ERROR
		System.out.println(ts);
	}

}
