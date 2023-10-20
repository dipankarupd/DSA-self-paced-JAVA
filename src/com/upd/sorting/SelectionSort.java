package com.upd.sorting;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int arr[] = {5,3,2,6,8};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	private static void selectionSort(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			
			int minIdx = i;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			
			if(minIdx != i) {
				swap(arr, minIdx, i);
			}
		}
	}
	
	
	private static void swap(int arr[] , int x, int y) {
		arr[x] = arr[x] ^ arr[y];
		arr[y] = arr[x] ^ arr[y];
		arr[x] = arr[x] ^ arr[y];
	}
}
