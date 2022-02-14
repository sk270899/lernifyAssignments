package com.wrapper;

public class ConstChaining {
	public ConstChaining() {
		this(4);
		System.out.println("I am default constructor");
	}
	
	public ConstChaining(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		ConstChaining obj = new ConstChaining();
	}

}
