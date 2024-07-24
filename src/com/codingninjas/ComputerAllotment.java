package com.codingninjas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComputerAllotment {
	public static int countCustomers(ArrayList<Integer> arr, int k) {
		// return (arr.size()/2)-k;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.size(); i++) {
			int num = arr.get(i);
			if (map.containsKey(num)) {
				if (map.get(num) != 0) {
					map.put(num, (map.get(num) + 1));
					k++;
				}
			} else {
				if (k != 0) {
					map.put(num, 1);
					k--;
				} else {
					map.put(num, 0);
				}
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 0)
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(1);
		int countCustomers = countCustomers(arr, 2);
		System.out.println(countCustomers);
	}
}