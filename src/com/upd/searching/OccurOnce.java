package com.upd.searching;
public class OccurOnce {

	public static void main(String[] args) {
		
		int arr1[] = {1,1,2,3,3,4,4};
		int[] arr2 = {1,1,2,2,3,4,4};
		int[] arr3 = {1,1,2,2,3};
		int[] arr4 = {1,2,2,3,3};
		int[] arr5 = {1,1,2,3,3};
		int[] arr6 = {1};
		System.out.println(singleNonDuplicate(arr6));

	}

	
	static int singleNonDuplicate(int arr[]) {
		
		int start = 0; 
		int end = arr.length - 1;
		
		if(arr.length == 1) {
			return arr[0];
		}
		
		while(start < end) {
			
			int mid = start + (end - start) / 2;
			
			if((mid & 1) != 0) {
				
				if(arr[mid] == arr[mid + 1]) {
					end = mid - 1;
				}
				
				else {
					start = mid + 1;	
				}
			}
			
			else {
				
				if(arr[mid] == arr[mid + 1]) {
					start = mid;
				}
				else {
					end = mid;
				}
				
			}
		}
		
		return arr[start];
	}
}
