package com.upd.sorting;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {

        int[] arr = {4,7,2,6,5,3,8,9};

        merge(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void merge(int[] arr, int start, int end){

        if(start >= end) {
            return;
        }

        int mid = start + (end - start) /2;
        merge(arr,start,mid);
        merge(arr,mid+1,end);

        mergeSort(arr,start,mid,end);
    }

    private static void mergeSort(int[] arr, int start, int mid, int end) {

        int[] result = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end) {

            if(arr[i] < arr[j]){
                result[k] = arr[i];
                i++;
                k++;
            } else {
                result[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i <= mid) {
            result[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end) {
            result[k] = arr[j];
            j++;
            k++;
        }

       for(int x = 0; x < result.length; x++) {
           arr[start + x] = result[x];
       }
    }
}
