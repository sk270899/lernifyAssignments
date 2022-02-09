package com.pack1;

public abstract class Beverages {
	void addMilk() {
		System.out.println("Milk added");
	}
	abstract void addIngredient();
}

class Tea extends Beverages{

	@Override
	void addIngredient() {
		// TODO Auto-generated method stub
		System.out.println("ingredients added to tea");
	}
	
}

class Coffee extends Beverages {

	@Override
	void addIngredient() {
		// TODO Auto-generated method stub
		System.out.println("ingredients added to coffee");
	}
	public static void main(String[] args) {
		System.out.println("hello");
	}
}
