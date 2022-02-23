package com.lambdaExpression;

@FunctionalInterface
interface SquareRoot {
	public int sqRoot(int x);
}
public class SquareRootUsingLambda {

	public static void main(String[] args) {
		SquareRoot obj = (x) -> {
			if (x == 0 || x == 1)
	            return x;
	        int i = 1, result = 1;
	        while (result <= x) {
	            i++;
	            result = i * i;
	        }
	        return i - 1;
		};

		System.out.println(obj.sqRoot(100));
	}

}
