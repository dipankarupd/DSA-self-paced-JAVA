package com.upd.sorting;
import java.util.Arrays;

/*
 * given an array of from 1 to n where 1 number is mistakenly repeated and hence one number is missing
 * find the repeated and missing number
 */

public class setMisMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,2,4};
		
		System.out.println(Arrays.toString(find(arr)));

	}
	
	private static int[] find(int arr[]) {
		int ans[] = new int[2];
		
		int i = 0;
		while(i<arr.length) {
			
			int correctIdx = arr[i] - 1;
			
			if(arr[i] != arr[correctIdx]) {
				swap(arr,i,correctIdx);
			}
			else {
				i++;
			}
			
			for(int j=0; j<arr.length;j++) {
				if(arr[j] != j+1) {
					ans[0] = arr[j];	// repeated
					ans[1] = j+1;	// missing
				}
			}
		}
		
		
		
		return ans;
	}

	private static void swap(int[] arr, int x, int y) {
		
		// TODO Auto-generated method stub
		
		arr[x] = arr[x] ^ arr[y];
		arr[y] = arr[x] ^ arr[y];
		arr[x] = arr[x] ^ arr[y];
		
	}

}
