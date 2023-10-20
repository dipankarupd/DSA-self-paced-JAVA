package com.upd.arrays;

public class MooreVotingAlgo {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 3, 1 };

		int cand = findMajority(arr);

		if (chkMajority(arr, cand)) {
			System.out.println("Majority element present. Element: " + cand);
		} else {
			System.out.println("Majority element absent");
		}
	}

	private static int findMajority(int[] a) {

		int candidate = a[0];
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == candidate) {
				count++;

			} else {
				count--;
			}

			if (count == 0) {
				candidate = a[i];
				count = 1;
			}
		}
		return candidate;

	}

	private static boolean chkMajority(int a[], int cand) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == cand) {
				count++;
			}

		}
		if (count > (a.length >> 1)) {
			return true;
		}

		else {
			return false;
		}

	}

}
