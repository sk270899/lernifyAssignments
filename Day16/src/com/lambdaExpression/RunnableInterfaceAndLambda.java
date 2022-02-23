package com.lambdaExpression;

public class RunnableInterfaceAndLambda {

	public static void main(String[] args) {
		Runnable obj = () -> System.out.println("using runnable interface (functional interface)");
		obj.run();
	}

}
