package com.lambdaExpression;

@FunctionalInterface
interface Addition {
	public int add(int a, int b);
}
public class AdditionWithLambda {

	public static void main(String[] args) {
		Addition obj = (a,b) -> a+b;
		System.out.println(obj.add(199, 1));
	}

}
