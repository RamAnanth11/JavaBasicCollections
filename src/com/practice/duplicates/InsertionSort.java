package com.practice.duplicates;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 2, 1, 4 };
		insertionSort(a);
		for (int i : a)
			System.out.print(i + " ");
	}

	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i], j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
	}
}
