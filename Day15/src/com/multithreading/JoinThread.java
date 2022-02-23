package com.multithreading;

public class JoinThread extends Thread {

	public void run() {
		System.out.println("inside run");
		for(int i=0;i<5;i++) {
			System.out.println("inside run for loop");
			try {
				Thread.sleep(2000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		JoinThread t1 = new JoinThread();
		t1.start();
		t1.join(10000);
		for(int i=0;i<5;i++) {
			System.out.println("Thread - " + Thread.currentThread().getName());
			Thread.yield();
		}
	}

}
