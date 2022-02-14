package com.collections;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<>();
		a.add(123);
		a.add(null);
		a.add("sahil");
		a.add(true);
		a.add(45.0f);
		
		System.out.println(a);
	}
}
