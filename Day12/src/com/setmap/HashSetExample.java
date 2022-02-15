package com.setmap;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> obj = new HashSet<>();
		for(int i=0;i<10;i++) {
			obj.add(i*10);
		}
		obj.add(199);
		obj.add(50);
		obj.add(51);
		System.out.println(obj);
	}
}
