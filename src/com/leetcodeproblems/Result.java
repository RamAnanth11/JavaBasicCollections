package com.leetcodeproblems;

import java.util.HashSet;
import java.util.Set;

class Result {

    /*
     * Complete the 'getMaxSubstrings' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static int getMaxSubstrings(String s, int k) {
        Set<String> out=new HashSet<>();
        int res=0;
        for(int i=0;i<s.length()-k;i++){
            for(int j=i+k;j<=s.length();j++){
                String str=s.substring(i, j);
                if(!out.contains(str)&&isPallindrome(str)){
                    res++;
                    out.add(str);
                }
            }
        }
        return res;

    }
    static boolean isPallindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
    public static void main(String[] args) {
	System.out.println(getMaxSubstrings("ababaeocco", 4));
	}

}