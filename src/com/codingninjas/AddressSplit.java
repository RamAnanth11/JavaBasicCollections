package com.codingninjas;

import java.util.ArrayList;
import java.util.List;

public class AddressSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "PhonePe Private Limited Office-2, Floor 5, Wing A, Block A,Salarpuria Softzone, Bellandur Village,Varthur Hobli, Outer Ring Road, Bangalore South,Bangalore, Karnataka, India, 560103";
		addressSpli(address).forEach(e -> System.out.println(e));
	}

	public static void addressSplit(String s) {
		List<String> address = new ArrayList<String>();
		String[] split = s.split(",");
		String fin = "";
		for (int i = 0; i < split.length; i++) {
			if (split[i].length() <= 20) {
				address.add(split[i]);
			} else {
				address.add(split[i].substring(0, 20));
				if (i + 1 < split.length)
					split[i + 1] = split[i].substring(20) + split[i + 1];
				else
					fin = split[i].substring(20);
			}
		}
	}

//	String address = "PhonePe Private Limited Office-2, Floor 5, Wing A, Block A,Salarpuria Softzone, Bellandur Village,Varthur Hobli, Outer Ring Road, Bangalore South,Bangalore, Karnataka, India, 560103";

	public static List<String> addressSpli(String s) {
		List<String> address = new ArrayList<String>();
		int index = 0;
		int length = 33;
		while (index < s.length()) {
			if (index + length > s.length())
				break;
			if (s.charAt(index + length) == ' ') {
				address.add(s.substring(index, index + length));
				index = index + length + 1;
			} else {
				int j = length + index;
				while (s.charAt(j) != ' ')
					j--;
				address.add(s.substring(index, j));
				index = j + 1;
			}

		}
		if (index < s.length())
			address.add(s.substring(index, s.length()));

		return address;
	}

}
