package com.wrapper;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {92,134,46,2,54,876};
		for(int x:arr) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		Arrays.sort(arr);
		for(int x:arr) {
			System.out.print(x + " ");
		}
	}

}
