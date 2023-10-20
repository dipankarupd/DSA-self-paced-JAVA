package com.upd.sorting;
public class MissingPositive {

	public static void main(String[] args) {
		int[] arr = {-3,5,6,1,3,4};
		System.out.println(firstNo(arr));

	}
	
	private static int firstNo(int[] arr) {
		
		int i=0;
		
		
		while(i < arr.length) {
			int correctIdx = arr[i] - 1;
			if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIdx]) {
				swap(arr,i,correctIdx);
			}
			else {
				i++;
			}
		}
		
		for(int j=0; j<arr.length;j++) {
			if(arr[j] != j+1) {
				return j+1;
				
			}
		}
		return arr.length + 1;
	}

	private static void swap(int[] arr, int x, int y) {
		
		arr[x] = arr[x] ^ arr[y];
		arr[y] = arr[x] ^ arr[y];
		arr[x] = arr[x] ^ arr[y];
		// TODO Auto-generated method stub
		
	}
	

}
