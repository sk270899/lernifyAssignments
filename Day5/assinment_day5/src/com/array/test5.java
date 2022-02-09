//Que 5 session 1
package com.array;

public class test5 {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int brr[][] = {{1,1,1},{1,1,1},{1,1,1}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]+=brr[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
