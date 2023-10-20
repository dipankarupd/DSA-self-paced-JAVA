package com.upd.sorting;
import java.util.Scanner;

public class PseudoSorted {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean k = true;
		
		int[] a  = new int[n] ;
		
		for(int i=0; i<n; i++) {
			
			a[i] = sc.nextInt();
			
			if(i>0 && a[i-1] > a[i]) {
				swap( a[i-1] , a[i]);
				k = true;
				
			}
				
				if(i>1 && a[i-2] > a[i-1] ) {
					swap(a[i-2],a[i-1]);
					k = false;
				}
		}
		
		if(k) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	private static void swap( int x , int y) {
		//System.out.println(x + " " + y);
		x = x^y;
		y = x^y;
		x = x^y;
		//System.out.println(x + " " + y);
	
	}

}
