package com.multithreading;

public class ThreadApplySleepMethod extends Thread{

	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		ThreadApplySleepMethod obj1 = new ThreadApplySleepMethod();
		ThreadApplySleepMethod obj2 = new ThreadApplySleepMethod();
		
		obj1.start();
		obj2.start();
	}

}
