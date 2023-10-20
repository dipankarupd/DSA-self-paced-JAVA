package com.upd.sorting;
import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,2,1,4};
		cyclic(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	private static void cyclic(int[] arr) {
		
		int i = 0;
		while(i<arr.length) {
			
			int correct = arr[i] - 1;
			
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			} else {
				i++;
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
