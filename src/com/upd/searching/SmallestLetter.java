package com.upd.searching;
public class SmallestLetter {

	public static void main(String[] args) {
		
		char arr[] = {'a', 'c' , 'h' , 'o' , 'r', 'w' , 'z' };
		char target = 'm';
		
		System.out.println("Smallest element: " + doWork(arr,target));

	}
	
	private static char doWork(char[] arr, char target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target > arr[mid]) {
				start = mid + 1;
			}
			else { 
				end = mid - 1;
			}
		}
		
		return arr[start % arr.length];
	}

}
