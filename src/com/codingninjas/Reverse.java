package com.codingninjas;

public class Reverse {
	 public static boolean palindromeNumber(int n){
	        if(n == 1){
	            return true;
	        }
	        int res = 0;
	        while(n > 0){
	            int rem = n %10;
	            res = (res*10) + rem;
	            n/=10;
	        }
	        System.out.println(res);
	        return (n == res)? true : false;
	    }
	 
	 public static void main(String[] args) {
		System.out.println(palindromeNumber(101));
	}
}
