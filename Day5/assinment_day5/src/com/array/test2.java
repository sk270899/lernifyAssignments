//Que 2 session 1
package com.array;

public class test2 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int avg = 0;
		for(int i:arr)
		{
			avg+=i;
		}
		avg/=arr.length;
		System.out.println("average is : " + avg);
	}
}
