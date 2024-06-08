package com.codingninjas;

import java.util.ArrayList;

public class SkipDigits {

	public static void main(String[] args) {
		ArrayList<Integer> theOrder = theOrder(9);
		for (int i : theOrder) {
			System.out.print(i + " ");
		}

	}

	public static ArrayList<Integer> theOrder(int n) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++)
			array.add(i);
		int index = 1;
		while (array.size() > 0) {
			result.add(array.get(index));
			array.remove(index);
			if (index + 1 >= array.size()) {
				if (array.size() > 1 && index % array.size() == 0)
					index = 1;
				else
					index = 0;
			} else
				index++;
		}

		return result;
	}
}
