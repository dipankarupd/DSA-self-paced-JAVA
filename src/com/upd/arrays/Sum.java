package com.upd.arrays;
public class Sum {

	public static void main(String[] args) {
		
		

		int arr1[] = { 5, 7, 9, 9 };
		int arr2[] = { 8, 3, 4, 1, 6 };
		int r[] = new int[arr2.length];

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = r.length - 1;

		while (k >= 0) {
			
			int d = 0;

			if (i >= 0) {

				

				if (arr2[j] > arr1[i]) {
					d = arr2[j] - arr1[i];
				} else {
					d = 10 + arr2[j] - arr1[i];
					arr2[j - 1] = arr2[j - 1] - 1;
				}
			} else {
				d = arr2[j];
			}

			r[k] = d;
			k--;
			j--;
			i--;
		}
		
		for(int val: r) {
			System.out.print(val);
		}

	}

}
