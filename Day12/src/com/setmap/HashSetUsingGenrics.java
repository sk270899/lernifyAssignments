package com.setmap;

import java.util.HashSet;
import java.util.Set;

public class HashSetUsingGenrics {

	public static void main(String[] args) {
		Set<Integer> obj = new HashSet<>();
		for(int i=0;i<10;i++) {
			obj.add(i*10);
		}
		obj.add(198);
		obj.add(50);
		obj.add(58);
		System.out.println(obj);
	}

}
