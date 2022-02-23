package com.multithreading;


class RunnableThreadExample implements Runnable {

	@Override
	public void run() {
		System.out.println("inside run of runnable interface");
	}
	
}
public class ThreadByRunnable {

	public static void main(String[] args) {
		RunnableThreadExample obj = new RunnableThreadExample();
		Thread t = new Thread(obj);
		t.start();
	}

}
