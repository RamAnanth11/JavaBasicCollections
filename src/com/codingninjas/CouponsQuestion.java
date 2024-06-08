package com.codingninjas;

import java.util.HashMap;

public class CouponsQuestion {

	public static void main(String[] args) {
		 int a [] = {3, 5, 0, 3, 0, 3, 1, 9, 4, 7, 8};
		 System.out.println(pickCoupons(11, a));

	}
	
	public static int pickCoupons(int n, int[] coupons) {
	 	HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
		 int count = 0;
		for(int i = 0; i < n; i++){
			int coupon = coupons[i];
			if(!map.containsKey(coupon)){
				map.put(coupon, i);
			}
			else {
				Integer integer = map.get(coupon);
				count = i - integer + 1;
				break;
			}
		}
		return (count != 0)? count : -1;
	}

}
