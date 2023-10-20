package com.upd.arrays;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] a = new int[n];
//		
//		System.out.println("Enter the elements of the array: ");
//		
//		for(int i=0; i<n; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		for(int i=0; i<n; i++) {
//			for(int j=n-1; j>=0; j--) {
//				
//				if(j == n-1-i) a[i] = a[j] ;
//			}
//		}
//		for(int i=0; i<n; i++) {
//			System.out.println(a[i]);
//		}
		
		int arr[] = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		
		int n = arr.length -1;
		int i=0;
		while(i<=n/2) {
			
			int temp = arr[i];
			arr[i] = arr[n-i];
			arr[n-i] = temp;
			i++;
		}
		
		for(int val: arr) {
			System.out.println(val);
		}
		
	}
	
	
}
