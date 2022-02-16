package com.SearchingSorting;

public class InsertionSort {
	static void insersionSort(int []arr) {
        for (int i = 1; i < arr.length; ++i) {
            int divPointer = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>divPointer) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = divPointer;
        }
	}
	public static void main(String[] args) {
		int []arr = {12,45,10,32,7,37,99};
		System.out.println("elements before sorting : ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println("");
		insersionSort(arr);
		System.out.println("elements after sorting : ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
}
