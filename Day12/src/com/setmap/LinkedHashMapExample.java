package com.setmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> obj = new LinkedHashMap<>();
		obj.put(23, "hello");
		obj.put(24, "world");
		obj.put(25, "this");
		obj.put(26, "is");
		obj.put(27, "language");
		obj.put(27, "java");
		obj.put(28, "program");
		
		System.out.println(obj);
	}

}
