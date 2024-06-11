package com.codingninjas;

import java.util.ArrayList;
import java.util.Collections;

public class NthLargestSmallestInteger {

	public static void main(String[] args) {
		 ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(1);
	        numbers.add(5);
	        numbers.add(9);
	        int k = 2;
	        int n = numbers.size();

	        // Print the ArrayList before sorting
	        System.out.println("Before sorting: " + numbers);

	        // Sort the ArrayList
	        Collections.sort(numbers);

	        // Print the ArrayList after sorting
	        System.out.println("After sorting: " + numbers);
	        System.out.println(numbers.get(k-1));
	        System.out.println(numbers.get(n-k));

	}
	
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		Collections.sort(arr);
		System.out.println();
		
		return null;
	}
}
