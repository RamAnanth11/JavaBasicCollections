package com.codingninjas;

import java.util.HashMap;

public class EqualsZeroAndOnes {

	public static void findLargestSubarray(int[] arr) {
		// HashMap to store the cumulative sum and its earliest index
		HashMap<Integer, Integer> map = new HashMap<>();

		int maxLength = 0;
		int endIndex = -1; // to store the end index of the largest subarray
		int sum = 0;

		// Initialize sum 0 at index -1 to handle subarrays starting from index 0
		map.put(0, -1);

		// Traverse through the array
		for (int i = 0; i < arr.length; i++) {
			// Convert 0 to -1 for this calculation
			sum += (arr[i] == 0) ? -1 : 1;

			// If this sum has been seen before
			if (map.containsKey(sum)) {
				// Check if this subarray is the largest so far
				int length = i - map.get(sum);
				if (length > maxLength) {
					maxLength = length;
					endIndex = i;
				}
			} else {
				// Store the sum with the current index if seeing it for the first time
				map.put(sum, i);
			}
		}

		// If a valid subarray was found
		if (maxLength > 0) {
			int startIndex = endIndex - maxLength + 1;
			System.out.println("Largest subarray is from index " + startIndex + " to " + endIndex);
		} else {
			System.out.println("No such subarray");
		}
	}

	public static void main(String[] args) {
//		int[] arr1 = { 1, 0, 1, 1, 1, 0, 0 };
//		findLargestSubarray(arr1); // Output: 1 to 6
//
//		int[] arr2 = { 1, 1, 1, 1 };
//		findLargestSubarray(arr2); // Output: No such subarray
//
//		int[] arr3 = { 0, 0, 1, 1, 0 };
//		findLargestSubarray(arr3); // Output: 0 to 3 or 1 to 4

		int[] arr4 = { 0, 0, 1, 1 };
		findLargestSubarray(arr4);
	}
}
