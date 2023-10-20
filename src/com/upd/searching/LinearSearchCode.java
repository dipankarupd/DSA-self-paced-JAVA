package com.upd.searching;

public class LinearSearchCode {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int elem = 6;
		System.out.println(search(arr,elem));

	}
	
	static int search(int arr[] , int n) {
		for(int val: arr) {
			if(val == n) {
				return val;
			}
		}
		return -1;
	}
}
