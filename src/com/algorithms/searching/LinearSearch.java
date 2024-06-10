package com.algorithms.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = { 5, 6, 4, 3, 7, 2, 8, 1 };
		System.out.println(linearSearch(a, 1));
	}

	public static int linearSearch(int[] a, int ele) {
		for (int i = 0; i < a.length; i++)
			if (ele == a[i])
				return i;
		return -1;
	}
}