package com.codingninjas;

public class BinaryAddition {

	public static void main(String[] args) {
		String x = "011011", y = "1010111";

		System.out.print(addBinaryString(x, y, 0, 0));

	}

	public static String addBinaryString(String a, String b, int n, int m) {
		int num1 = Integer.parseInt(a,2);
		int num2 = Integer.parseInt(b,2);

		int sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + sum);
		String result = Integer.toBinaryString(sum);
		return result;
	}

}
