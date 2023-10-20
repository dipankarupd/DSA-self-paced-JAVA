package com.upd.searching;
import java.util.Arrays;

public class Search2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[][] = {
				{4,14,98},
				{16,21,74},
				{22,16,59,8},
		};
		
		int num = 74;
		
		int[] result = search(arr,num);
		System.out.println(Arrays.toString(result));
	}

	
	static int[] search(int arr[][], int num) {
		
		if(arr.length == 0) {
			return new int[] {-1,-1};
		}
		
		for(int rows  =0; rows<arr.length;rows++) {
			
			for(int cols = 0;cols<arr[rows].length;cols++) {
				
				if(arr[rows][cols] == num) {
					return new int[] {rows,cols};
				}
			}
			
		}
		return new int[] {-1,-1};
	}
}
