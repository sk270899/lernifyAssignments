//******linear search program******

package com.SearchingSorting;

import java.util.Scanner;

public class LinearSearch {
	static int linearSearch(int []arr, int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int []arr = {10,32,12,213,43,78};
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(linearSearch(arr,a)==-1) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element is at index : "+linearSearch(arr,a));
		}
		sc.close();
	}
}
