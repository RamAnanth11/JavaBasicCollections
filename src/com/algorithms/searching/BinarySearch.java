package com.algorithms.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9 };
		System.out.println(binarySearch(a, 5));
	}

	public static int binarySearch(int[] a, int ele) {
		int start = 0, end = a.length - 1, mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (ele == a[mid])
				return mid;
			else if (ele < a[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

}
