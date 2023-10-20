package com.upd.sorting;
public class MissingNumber {

	public static void main(String[] args) {
		
		// given array from 0 to N. find the missing number in that array
		
	//	int arr1[] = {4,2,0,1};
		int arr2[] = {3,2,0,1};
		
		System.out.println(findMissing(arr2));

	}
	
	static int findMissing(int arr[]) {
		
		int i = 0;
		
		while(i<arr.length) {
			int correct = arr[i];
			
			if(arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}
			
			else {
				i++;
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			
			if(arr[j] != j) {
				return j;
			}
		}
		
		return arr.length;
	}

	private static void swap(int[] arr, int x, int y) {
		// TODO Auto-generated method stub
		
		arr[x] = arr[x] ^ arr[y];
		arr[y] = arr[x] ^ arr[y];
		arr[x] = arr[x] ^ arr[y];
		
	}

}
