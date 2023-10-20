package com.upd.arrays;
public class NonRepeating {

	public static void main(String[] args) {

		int a[] = { 1, 2, 1, 4, 2, 2, 1 };
		int n = a.length;

		int result = printNonRepeating(a, n);

		if (result == -1) {
			System.out.println("No such element");
		}

		else {

			System.out.println("The non repeating element: " + result);
		}
	}

	private static int printNonRepeating(int[] a, int n) {
		int j;

		// { 1, 2, 1, 4, 2, 2, 1 };

		for (int i = 0; i < n; i++) {

			for (j = 0; j < n; j++) {

				if (i != j && a[i] == a[j]) {

					break;
				}
			}

			if (j == n) {
				return a[i];
			}

		}

		return -1;

	}
}
