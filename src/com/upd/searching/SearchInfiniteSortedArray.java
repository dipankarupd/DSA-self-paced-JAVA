package com.upd.searching;
public class SearchInfiniteSortedArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 7, 8, 11, 13, 15, 16, 18, 22, 25, 28, 31 };
		int target = 13;

		// for infinite search we do not know the start and end index and we cannot use
		// the arr.length

		int start = 0;
		int end = 1;
		
		
		while(target > arr[end]) {
			int newStart = end + 1;
			end = end + (end - start + 1) * 2;
			start = newStart;
		}
		
		
		System.out.println(binarySearch(arr,target,start,end));
		
	}
	
	private static int binarySearch(int arr[] , int target, int start, int end) {
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(target > arr[mid]) {
				start = mid + 1;
			}
			else if(target < arr[mid]) {
				end = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
