package com.codingninjas;

import java.util.ArrayList;
import java.util.HashSet;

public class PossibleNumbers {
	public static ArrayList<Integer> numberWithSameConsecutiveDifference(int N, int K) {
		if (N == 1) {
			// Single-digit numbers: all valid
			ArrayList<Integer> result = new ArrayList<>();
			for (int i = 0; i <= 9; i++) {
				result.add(i);
			}
			return result;
		}

		ArrayList<Integer> result = new ArrayList<>();
		HashSet<Integer> seenNumbers = new HashSet<>(); // Track seen numbers to avoid duplicates

		for (int start = 1; start <= 9; start++) {
			explore(result, seenNumbers, start, N - 1, K);
		}

		return result;
	}

	private static void explore(ArrayList<Integer> result, HashSet<Integer> seenNumbers, int num, int remaining,
			int K) {
		if (remaining == 0) {
			// Valid number found, add if not seen before
			if (!seenNumbers.contains(num)) {
				result.add(num);
				seenNumbers.add(num); // Mark as seen
			}
			return;
		}

		// Explore adding and subtracting K, ensuring digits stay within bounds
		if (num % 10 + K <= 9) {
			explore(result, seenNumbers, num * 10 + num % 10 + K, remaining - 1, K);
		}
		if (num % 10 >= K && num % 10 - K >= 0) {
			explore(result, seenNumbers, num * 10 + num % 10 - K, remaining - 1, K);
		}
	}

	public static void main(String[] args) {
		int N = 3;
		int K = 0;
		ArrayList<Integer> numbers = numberWithSameConsecutiveDifference(N, K);
		System.out.println(numbers); // Output: [111, 222, 333, 444, 555, 666, 777, 888, 999]
	}
}