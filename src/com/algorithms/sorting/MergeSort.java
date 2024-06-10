package com.algorithms.sorting;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 2, 1, 4 };
		mergeSort(a);
		for (int i : a)
			System.out.print(i + " ");
	}

	public static void mergeSort(int[] a) {
		if (a.length == 1)
			return;
		int[] left = new int[a.length / 2];
		int[] right = new int[a.length - left.length];
		for (int i = 0; i < left.length; i++)
			left[i] = a[i];
		for (int j = 0; j < right.length; j++)
			right[j] = a[left.length + j];
		mergeSort(left);
		mergeSort(right);
		merger(left, right, a);

	}

	public static void merger(int[] left, int[] right, int[] a) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j])
				a[k++] = left[i++];
			else
				a[k++] = right[j++];
		}
		while (i < left.length)
			a[k++] = left[i++];
		while (j < right.length)
			a[k++] = right[j++];
	}
}