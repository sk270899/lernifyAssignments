package com.multithreading;

public class ThreadClass extends Thread {
	@Override
	public void run() {
		System.out.println("thread running inside run method.");
	}
	
//	@Override
//	public void start() {
//		System.out.println("hello");
//	}
	
	public static void main(String[] args) {
		ThreadClass obj = new ThreadClass();
		obj.start();
//		obj.run();
	}

}
