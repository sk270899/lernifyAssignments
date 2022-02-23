package com.lambdaExpression;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> obj =  x -> (x%2==0);
		System.out.println(obj.test(77));
	}

}
