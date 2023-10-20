package com.upd.arrays;


public class Span {

	public static void main(String[] args) {
		
		int arr[] = {44,22,2,11,9};
		
		int largest = large(arr,arr.length-1);
		int smallest = small(arr, arr.length-1);
		
		System.out.println(largest - smallest);
		
	}
	
	static int large(int arr[], int n) {
		
		if(n == 0) {
			return arr[n];
		}
		
		int l = large(arr,n-1) ;
		if(arr[n] > l) {
			l = arr[n];
		}
		return l;
	}
static int small(int arr[], int n) {
		
		if(n == 0) {
			return arr[n];
		}
		
		int l = small(arr,n-1) ;
		if(arr[n] < l) {
			l = arr[n];
		}
		return l;
	}

}
