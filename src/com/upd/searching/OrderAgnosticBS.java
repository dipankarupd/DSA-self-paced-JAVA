package com.upd.searching;
public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int[] arr = {5,4,3,2,1};
		
		int target = 4;
		
		
		if(arr[0] < arr[arr.length-1]) {
		  System.out.println(ascSearch(arr,target));
		}
		else if(arr[0] > arr[arr.length-1]) {
			System.out.println(desSearch(arr,target));
		}
		else {
			System.out.println("The array consist of a single digit");
		}
	}
		
		private static int ascSearch(int arr[] , int target) {
			
			
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			
			else {
				return mid;
			}
		}
			
			
			return -1;
		}
			
		
		
		private static int desSearch(int arr[] , int target) {
			
			
			int start = 0;
			int end = arr.length - 1;
			
			while(start <= end) {
				int mid = start + (end - start) / 2;
				
				if(target > arr[mid]) {
					end = mid - 1;
				}
				else if(target < arr[mid]) {
					start = mid + 1;
				}
				
				else {
					return mid;
				}
			}
			
			
			return -1;
		}

}
