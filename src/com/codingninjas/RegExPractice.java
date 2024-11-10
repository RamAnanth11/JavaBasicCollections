package com.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPractice {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[6-9][0-9]{9}");
		Pattern pattern2 = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
		
		Matcher matcher = pattern2.matcher("CAOPA9350D");
		Matcher matcher1 = pattern.matcher("9487466738");
		Matcher matcher2 = pattern.matcher("sssss");
		
		
		System.out.println(matcher1.matches());
		System.out.println(matcher2.matches());
		System.out.println(matcher.matches());
		
		
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		// Arrays.sort(nums);
		System.out.println(threeSum(nums));
		// System.out.println(binarySearch(nums, 1, 0, nums.length-1));
	}

	public static boolean binarySearch(int[] nums, int number, int start, int end) {
		if (start > end)
			return false;
		int middle = (start + end) / 2;
		if (nums[middle] == number)
			return true;
		if (nums[middle] > number)
			return binarySearch(nums, number, start, middle - 1);
		else
			return binarySearch(nums, number, middle + 1, end);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> out = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length - 1; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				int num = 0 - (nums[i] + nums[j]);
				if (nums[j + 1] > num)
					break;
				if (binarySearch(nums, num, j + 1, nums.length - 1)) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(num);
					out.add(list);
				}
			}
		}
		return out;
	}

}
