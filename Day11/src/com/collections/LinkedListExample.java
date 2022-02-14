package com.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> l = new LinkedList<>();
		l.add(100);
		l.add("sahil");
		l.add(45.0f);
		l.add(false);
		l.add(null);
		
		System.out.println(l);
		System.out.println("contains 45 integer: " + l.contains(45));
		System.out.println("contains 45.0 integer: " + l.contains(45.0));
		System.out.println("first element: " + l.getFirst());
		System.out.println("last element: " + l.getLast());
		System.out.println("is empty: " + l.isEmpty());
		System.out.println(".remove() removes first element: " + l.remove());
		System.out.println("size after removing first element: " + l.size());
		System.out.println(l.add(119));
		System.out.println(l);
	}

}
