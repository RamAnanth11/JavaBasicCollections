package com.codingninjas;

import java.util.Arrays;

public class Streams {
	public static void main(String[] args) {
		String s = "12345";

		int sum = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).sum();

		int sum2 = s.chars().map(Character::getNumericValue).sum();

		System.out.println("ArraysStream:\t" + sum + "\nCharsMethod:\t" + sum2);

	}
}
