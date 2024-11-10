package com.codingninjas;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println(myAtoi("0-1"));
	}

	public static int reverse(int x) {
		if (x / 10 == 0)
			return x;
		int sign = x > 0 ? 1 : -1;
		x *= sign;
		long out = 0;
		while (x > 0) {
			int rem = x % 10;
			out = (out * 10) + rem;
			x /= 10;
		}
		out *= sign;
		if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE)
			return 0;
		return (int) out;
	}

	public static  int myAtoi(String s) {
		s = s.trim();
		int sign = 1;
		
		if (s.charAt(0) == '-') {
			s = s.substring(1);
			sign = -1;
		}

		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (sb.length()==0 &&c=='0') {
				continue;
			}else if (c>= '0' && c <= '9')
				sb.append(c);
			else
				break;
		}
		if(sb.toString().length() == 0)
            return 0;
		long out = Long.parseLong(sb.toString()) * sign;
		if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE)
			return out > Integer.MAX_VALUE ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		return (int) out;
	}

}
