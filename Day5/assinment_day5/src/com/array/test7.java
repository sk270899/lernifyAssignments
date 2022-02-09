//Que 7 session 1
package com.array;

public class test7 {
	static int getMin(int arr[]) {
		int min = arr[0];
		for(int i:arr) {
			if(min>i)
				min=i;
		}
		return min;
	}
	public static void main(String[] arg) {
		int arr[] = {1,2,3,4,5,-9};
		System.out.println(getMin(arr));
	}
}
