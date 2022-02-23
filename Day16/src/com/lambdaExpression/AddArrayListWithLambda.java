package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;


@FunctionalInterface
interface InsertElementsToArrayList {
	public void insertElements();
}
@FunctionalInterface
interface AddArrayList {
	public int add();
}
public class AddArrayListWithLambda {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		
		InsertElementsToArrayList objInsertElements = () -> {
			for(int i=0;i<=10;i++) {
				li.add(i);
			}
		};
		objInsertElements.insertElements();
		
		AddArrayList objAddElements = () -> {
			int sum=0;
			for(int x : li) {
				sum+=x;
			}
			return sum;
		};
		System.out.println(objAddElements.add());
	}

}
