package com.upd.sorting;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 4, 1, 6, -1 };
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<arr.length - 1; i++) {
			
			for(int j=1+i; j > 0; j--) {
				
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
				
				else {
					break;
				}
			}
		}
		
	}

	private static void swap(int[] arr, int x, int y) {
		// TODO Auto-generated method stub
		
		arr[x] = arr[x] ^ arr[y];
		arr[y] = arr[x] ^ arr[y];
		arr[x] = arr[x] ^ arr[y];
		
	}

}
