package com.upd.searching;
import java.util.Arrays;

public class FirstAndLastPosnOfSortedArray {

	public static void main(String[] args) {

		int arr[] = { 2,7,7,8,8,10 };
		int target = 8;

		int[] result = doWork(arr, target);
		System.out.println(Arrays.toString(result));

	}

	private static int[] doWork(int arr[], int target) {

		int ans[] = { -1, -1 };

//		int start = search(arr,target,true);
//		int end = search(arr,target,false);
//		ans[0] = start;
//		ans[1] = end;
//		return ans;

		// better:

		ans[0] = search(arr, target, true);
		if (arr[0] != -1) {
			ans[1] = search(arr, target, false);
		}
		return ans;
	}

	private static int search(int arr[], int target, boolean findStartIndex) {

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			}

			else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}
