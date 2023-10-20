package com.upd.searching;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,5,6,9};
		int target = 8;
		
		int result [] = twoSum(arr,target);
		
		for(int val: result) {
			System.out.println(val);
		}

	}
	
	static int[] twoSum(int arr[], int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		int ans[] = {-1,-1};
		
		while(start <= end) {
				
			int answer = arr[start] + arr[end];
			
			if(answer == target) {
				
				ans[0] = start;
				ans[1] = end;
				break;
			}
			
			else if(answer < target) {
				start = start + 1;
			}
			
			else {
				end = end - 1;
			}
			
		}
		
		return ans;
	}

}
