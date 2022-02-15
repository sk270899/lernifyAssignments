package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueExample {
	public static void main(String[] args) {
		Queue<String> qu = new PriorityQueue<>();
		qu.add("sahil");
		qu.add("khandelwal's");
		qu.add("hello");
		qu.add("world");
		qu.add("into");
		
		
		System.out.println(qu);
		
		Iterator<String> itr = qu.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------");
		qu.poll();
		qu.remove();
		itr = qu.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

