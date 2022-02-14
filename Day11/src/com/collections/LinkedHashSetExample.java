package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		//lhs.add(100);  ERROR
		//lhs.add(123);  ERROR
		lhs.add(null);
		lhs.add("sahil");
		lhs.add("khandelwal");
		//lhs.add(true);  ERROR
		//lhs.add(45.0f);  ERROR
		
		System.out.println(lhs);
	}
}
