package com.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hs = new HashSet<>();
		
		hs.add(100);
		hs.add(123);
		hs.add(null);
		hs.add("sahil");
		hs.add(true);
		hs.add(45.0f);
		
		System.out.println(hs);
	}

}
