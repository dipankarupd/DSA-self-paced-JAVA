package com.upd.sorting;

public class BubbleSort {
	// defining a function to print the result value
	public static void printArray(int arr[]) {
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {5,7,1,3,2};
		
		for(int i=0; i<arr.length-1; i++) {
			
			boolean swapped = false;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					
					//swapping for sorting
					swapped = true;
				int temp;
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
				
				}
			} //if the given array is already sorted then this will reduce the loop operation
			if(!swapped) {
				break;
			}
		}
		printArray(arr);  		// call the function printArray

	}

}
