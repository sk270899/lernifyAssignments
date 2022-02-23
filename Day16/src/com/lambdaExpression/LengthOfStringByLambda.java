package com.lambdaExpression;

import java.util.function.Predicate;

public class LengthOfStringByLambda {

	public static void main(String[] args) {
		Predicate<String> obj = t -> t.length()>6;
		System.out.println(obj.test("sahil"));
	}

}
