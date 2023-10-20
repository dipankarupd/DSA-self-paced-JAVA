package com.upd.arrays;
public class UniqueElem {

	public static void main(String[] args) {
		int a[] = { 3, 3, 4, 4, 8, 4, 1, 8, 3, 8 };
		findUnique(a);

	}

	static void findUnique(int a[]) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			int b = a[i];

			for (int j = 0; j < a.length; j++) {
				if (a[j] == b) {
					count++;
				}
			}
			if (count == 1)
				result = b;
		}

		System.out.println(result);
	}
}
