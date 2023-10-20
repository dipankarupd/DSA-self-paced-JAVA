package com.upd.arrays;

import java.util.*;

public class Rotate {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		int k = 3;
		
		if(k<0) {
			k = k + arr.length;
		}
		
		if(k>=0) {
			k = k % arr.length;
		}
		
		reverse(arr,0,arr.length - k - 1);
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length-1);
		
		for(int val: arr) {
			System.out.print(val + " " );
		}
		
	}
	
	static void reverse(int arr[], int i, int n) {
		
		while(i<=n/2) {
			int temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
			
			i++;
			n--;
		}
	}
}
