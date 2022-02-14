package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintByIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> a = new ArrayList<>();
		a.add(123);
		a.add(null);
		a.add("sahil");
		a.add(true);
		a.add(45.0f);
		
		Iterator<Object> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
