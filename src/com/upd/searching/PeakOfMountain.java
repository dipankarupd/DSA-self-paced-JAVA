package com.upd.searching;
public class PeakOfMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,6,7,11,9,5,3};
		
		System.out.println((arr));
	

	}
	
	private static int peak(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] < arr[mid+1]) {
				start = mid + 1;
			}
			
			else {
				end = mid;
			}
		}
		
		return start;
	}
	


}
