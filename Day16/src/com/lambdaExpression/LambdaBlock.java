package com.lambdaExpression;

@FunctionalInterface
interface functionalInterface {
	public void exp();
}
public class LambdaBlock {

	public static void main(String[] args) {
		functionalInterface obj = () -> System.out.println("this is printed by using lambda expression");
		obj.exp();
	}

}
