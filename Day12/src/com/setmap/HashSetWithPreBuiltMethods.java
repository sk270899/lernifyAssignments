package com.setmap;

import java.util.HashSet;
import java.util.Set;

public class HashSetWithPreBuiltMethods {
	public static void main(String[] args) {
		Set<Object> obj = new HashSet<>();
		for(int i=0;i<10;i++) {
			obj.add(i*10);
		}
		obj.add(198);
		obj.add(50);
		obj.add(58);
//		System.out.println(obj);
		
		Set<Object> obj2 = new HashSet<>();
		obj2.add(12);
		obj2.add(null);
		obj2.add("sahil");
		
		obj.addAll(obj2);
		System.out.println(obj);
		obj.remove(null);
		System.out.println(obj);
		obj.retainAll(obj2);
		System.out.println(obj);
	}
}
