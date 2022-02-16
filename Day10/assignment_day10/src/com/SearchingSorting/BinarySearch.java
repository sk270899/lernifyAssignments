package com.SearchingSorting;

import java.util.Scanner;

public class BinarySearch {
	static int binarySearch(int []arr, int start, int end, int x) {
		if(end>=start) {
			int mid = (start+end)/2;
			if(arr[mid] == x) {
				return mid;
			}
			else if(arr[mid]>x) {
				return binarySearch(arr,start,mid-1,x);
			}
			else return binarySearch(arr, mid+1, end, x);
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int []arr = {10,33,12,323,23,19};
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(binarySearch(arr, 0, arr.length, x)!=-1) {
			System.out.println("element found at index : "+binarySearch(arr, 0, arr.length, x));
		}
		else {
			System.out.println("element not found");
		}
		sc.close();
	}
}
