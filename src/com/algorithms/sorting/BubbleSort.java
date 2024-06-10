package com.algorithms.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 2, 1, 4 };
		bubbleSort(a);
		for (int i : a)
			System.out.print(i + " ");

	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

}
