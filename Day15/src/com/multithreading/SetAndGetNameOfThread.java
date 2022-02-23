package com.multithreading;

public class SetAndGetNameOfThread extends Thread {

	public void run() {
		System.out.println("thread started");
		System.out.println("name of thread - " + Thread.currentThread().getName());
		Thread.currentThread().setName("threadNameSetInRun");
		System.out.println("name of thread - " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		SetAndGetNameOfThread t1 = new SetAndGetNameOfThread();
		t1.start();
		t1.setName("myThread");
	}
}
