package com.upd.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {7,3,8,2,9,4};

        System.out.println(Arrays.toString(merge(arr)));
    }

    private static int[] merge(int[] arr) {

        // base case:
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;

        int[] arr1 = merge(Arrays.copyOfRange(arr,0,mid));
        int[] arr2 = merge(Arrays.copyOfRange(arr,mid,arr.length));

        int[] result = new int[arr1.length + arr2.length];

        return reassemble(arr1,arr2,result);
    }

    private static int[] reassemble(int[] arr1, int[] arr2, int[] arr) {
        int i = 0,j=0,k=0;
//
        while(i<arr1.length && j<arr2.length) {

            if(arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while(j < arr2.length) {
            arr[k] = arr2[j];
            k++;
            j++;
        }

        return arr;
    }
}
