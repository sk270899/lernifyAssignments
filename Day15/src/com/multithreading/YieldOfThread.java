package com.multithreading;

public class YieldOfThread extends Thread {

	public void run() {
		System.out.println("inside run and thread name - " + Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			Thread.yield();
			System.out.println("running inside for loop "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		YieldOfThread t1 = new YieldOfThread();
		YieldOfThread t2 = new YieldOfThread();
		
		t1.start();
		t2.start();
		for(int i=0;i<5;i++) {
			System.out.println("thread started "+Thread.currentThread().getName());
		}
		
		
	}

}
