package com.upd.arrays;

public class PerfectSquare {

	public static void main(String[] args) {

		boolean result = perfectSquare(100);

		if (result) {
			System.out.println("The number is a perfect square ");
		} else {
			System.out.println("The number is not a perfec square ");
		}

	}

	static boolean perfectSquare(int num) {
		int start = 1;
		int end = num / 2;

		if (num == 1) {
			return true;
		}

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (mid * mid == num) {
				return true;
			}

			else if (mid * mid > num) {
				end = mid - 1;
			}

			else {
				start = mid + 1;
			}
		}

		return false;
	}

}
