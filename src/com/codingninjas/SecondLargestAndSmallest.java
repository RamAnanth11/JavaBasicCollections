package com.codingninjas;

import java.util.Arrays;

public class SecondLargestAndSmallest {
	public static int[] getSecondOrderElements(int n, int[] a) {
		Arrays.sort(a);
		int[] b = new int[2];
		b[0] = a[n - 2];
		b[1] = a[1];
		return b;
	}
	
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int[] is = getSecondOrderElements(5, a);
		for(int i : is) {
			System.out.print(i+" ");
		}
		
	}
}
