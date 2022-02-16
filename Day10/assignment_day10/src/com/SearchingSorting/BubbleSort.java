package com.SearchingSorting;

public class BubbleSort {

	static void bubbleSort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int []arr = {12,45,10,32,7,37,99};
		System.out.println("elements before sorting : ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println("");
		bubbleSort(arr);
		System.out.println("elements after sorting : ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
}
