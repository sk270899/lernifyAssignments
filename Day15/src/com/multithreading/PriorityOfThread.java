package com.multithreading;

public class PriorityOfThread extends Thread {

	public void run() {
		System.out.println("inside run of thread class");
	}
	public static void main(String[] args) {
		PriorityOfThread p1 = new PriorityOfThread();
		PriorityOfThread p2 = new PriorityOfThread();
		
		System.out.println("Priority of p1 - " + p1.getPriority());
		System.out.println("Priority of p2 - " + p2.getPriority());
		
		p1.setPriority(MIN_PRIORITY);
		p2.setPriority(MAX_PRIORITY);
		
		System.out.println("Priority of p1 - " + p1.getPriority());
		System.out.println("Priority of p2 - " + p2.getPriority());
		
		p1.setPriority(9);
		p2.setPriority(2);
		
		System.out.println("Priority of p1 - " + p1.getPriority());
		System.out.println("Priority of p2 - " + p2.getPriority());
	}

}
