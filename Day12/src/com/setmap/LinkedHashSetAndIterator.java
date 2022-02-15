package com.setmap;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetAndIterator {

	public static void main(String[] args) {
		Set<Object> obj = new LinkedHashSet<>();
		for(int i=0;i<10;i++) {
			obj.add(i*10);
		}
		obj.add(198);
		obj.add(50);
		obj.add(58);
		System.out.println(obj);
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
