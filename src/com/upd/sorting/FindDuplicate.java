package com.upd.sorting;
import java.util.ArrayList;

/*
 *  given an array from[1,n] where only one element is repeated. Find the element:
 */

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
									// 0,1,2,3,4
		int arr[] = {4,2,4,5,5,6}; 	// 1,5,3,4,5
		
		ArrayList <Integer> printAns = duplicate(arr);
		
		for(int val: printAns) {
			System.out.print(val + " ");
		}
		

	}
	
	private static ArrayList<Integer> duplicate(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
			
			int correct = arr[i]-1;
			
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}
			
			else {
				i++;
			}
		}
		
		ArrayList <Integer> ans = new ArrayList<>();
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j]-1 != j) {
				ans.add(arr[j]);
				
			}
		}
		
		return ans;
		
	}

	private static void swap(int[] arr, int x, int y) {

		arr[x] = arr[x] ^ arr[y];
		arr[y] = arr[x] ^ arr[y];
		arr[x] = arr[x] ^ arr[y];
	}

}
