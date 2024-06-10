package com.algorithms.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 2, 1, 4 };
		selectionSort(a);
		for (int i : a)
			System.out.print(i + " ");

	}

	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[index] > a[j])
					index = j;
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
		}
	}

}