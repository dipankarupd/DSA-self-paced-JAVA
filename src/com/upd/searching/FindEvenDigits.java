package com.upd.searching;
public class FindEvenDigits {

	public static void main(String[] args) {
		
		int arr[] = {7,64,887,4125,45,99999};
		
		
		System.out.println(digit(arr));

	}

	static int digit(int arr[]) {
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(even(arr[i])) {
				count++;
			}
		}
		
		return count;
	}
	
	static boolean even(int i) {
		String temp = Integer.toString(i);
		
		if(temp.length() % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	
}
