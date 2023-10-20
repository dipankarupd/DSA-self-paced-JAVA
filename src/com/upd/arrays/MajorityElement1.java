package com.upd.arrays;

public class MajorityElement1 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 1, 1 };
        int maxCount = 1, result = 0;
        // int majorityElem = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int a = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (a == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                result = arr[i];
            } else {

            }
        }
        if (maxCount > (arr.length >> 1)) {
            System.out.println("Majority element: " + result);
        } else {
            System.out.println("No majority element present");
        }
    }

}
