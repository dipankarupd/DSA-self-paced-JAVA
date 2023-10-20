package com.upd.searching;
public class CeilingAndFloor {

	public static void main(String[] args) {
		
	
		int arr[] = {6,8,11,19,24,26,32,33,39};
		int target = 17;
		
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(target > arr[mid]) {
				start = mid + 1;
			}
			else if (target < arr[mid]) {
				end = mid - 1;
			}
			else {
				System.out.println(mid);
			}
		}
		
		System.out.println("ceiling value: " + arr[start]);
		System.out.println("floor value: " + arr[end]);

	}

}
