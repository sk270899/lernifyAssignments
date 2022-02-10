package com.SearchingSorting;

public class SelectionSort {
	
	static void selectionSort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	public static void main(String[] args) {
		int []arr = {12,45,10,32,7,37,99};
		System.out.println("elements before sorting : ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println("");
		selectionSort(arr);
		System.out.println("elements after sorting : ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
}
