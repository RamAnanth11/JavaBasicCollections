package com.practice.duplicates;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 2, 1, 4 };
		selectionSort(a);
		for (int i : a)
			System.out.print(i + " ");

	}

	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[index] > a[j])
					index = j;
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
		}
	}
}
