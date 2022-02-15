package com.setmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetAndIterator {
	public static void main(String[] args) {
		Set<Object> obj = new HashSet<>();
		for(int i=0;i<10;i++) {
			obj.add(i*10);
		}
		obj.add(199);
		obj.add(50);
		obj.add(51);
		System.out.println(obj);
		
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
