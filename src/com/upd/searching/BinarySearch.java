package com.upd.searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int target = 2;
		
		int result = search(arr,target);
		System.out.println(result);

	}

	
	static int search(int arr[], int n) {
		int start = 0; 
		int end = arr.length - 1;
		
		
		
		while (start <= end) {
			
			
			int mid = start  + (end - start)/2;
			
			if(n > arr[mid]) {
				start = mid + 1;
			}
			else if(n < arr[mid]) {
				end = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
