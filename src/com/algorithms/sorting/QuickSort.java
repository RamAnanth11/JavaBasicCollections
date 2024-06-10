package com.algorithms.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 2, 1, 4 };
		quickSort(a, 0, a.length - 1);
		for (int i : a)
			System.out.print(i + " ");
	}

	public static void quickSort(int[] a, int start, int end) {
		if (start >= end)
			return;
		int pivot = a[(start + end) / 2];
		int i = start, j = end;
		while (i <= j) {
			while (a[i] < pivot)
				i++;
			while (a[j] > pivot)
				j--;
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		quickSort(a, start, j);
		quickSort(a, i, end);
	}
}
