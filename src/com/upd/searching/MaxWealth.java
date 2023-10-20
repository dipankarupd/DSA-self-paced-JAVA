package com.upd.searching;

public class MaxWealth {

	public static void main(String[] args) {

		/*
		 * You are given an m x n integer grid accounts where accounts[i][j] is the
		 * amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​
		 * bank. Return the wealth that the richest customer has.
		 * 
		 * A customer's wealth is the amount of money they have in all their bank
		 * accounts. The richest customer is the customer that has the maximum wealth.
		 * 
		 * Example 1:
		 * 
		 * Input: accounts = [[1,2,3],[3,2,1]] Output: 6 Explanation: 1st customer has
		 * wealth = 1 + 2 + 3 = 6 2nd customer has wealth = 3 + 2 + 1 = 6 Both customers
		 * are considered the richest with a wealth of 6 each, so return 6.
		 */

		int arr[][] = {

				{ 1, 22, 3 },	// 26
				{ 17, 8, 6 }, 	//31
				{ 4, 5, 9, 7 },	// 25
				{ 3, 14 }, 	// 17
				{35}
				};
		
		System.out.println(maxWealth(arr));

	}
	
	static int maxWealth (int arr[][]) {
		int max = 0;
		
		for(int rows = 0; rows < arr.length; rows++) {
			
			int count = 0;
			for(int cols = 0; cols < arr[rows].length; cols++) {
				
				count+= arr[rows][cols];
				
			}
			
			if(count > max) {
				max = count;
			}
		}
		
		
		
		return max;
	}

}
