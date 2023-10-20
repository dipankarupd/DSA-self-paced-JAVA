package com.upd.arrays;

public class BarChart {


        public static void main(String[] args) {

            int arr[] = {3,0,2,1,4};

            doWork(arr);

        }

        static void doWork(int[] arr) {

            int max = 4;

            for(int i = max; i>=1; i--) {
                for(int j = 0; j<arr.length; j++) {
                    if(arr[j] >= i) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
}
