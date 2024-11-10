package com.codingninjas;

public class FindMaxFruits {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3 };
		System.out.println(findMaxFruits(a, a.length));
	}

	public static int findMaxFruits(int[] arr, int n) {
		int first = arr[0];
		int second = -1;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (second == -1 && arr[i] != first)
				second = arr[i];
			if (arr[i] == first) {
				count++;
				continue;
			} else if (arr[i] == second) {
				count++;
				continue;
			} else
				return count;
		}
		return count;
	}
}