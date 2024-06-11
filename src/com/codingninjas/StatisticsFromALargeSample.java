package com.codingninjas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StatisticsFromALargeSample {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();

	        // Add all the integers to the ArrayList
	        int[] numbers = {
	            1, 0, 1, 1, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
	        };

	        for (int number : numbers) {
	            list.add(number);
	        }
	        ArrayList<Double> sampleStats = sampleStats(list);
	        for(double a : sampleStats)
	        	System.out.println(a);

	}

	public static ArrayList<Double> sampleStats(ArrayList<Integer> count) {
		int min = 0, max = 0, sum = 0, total = 0, mode = 0;
		ArrayList<Double> arr = new ArrayList<Double>();
		ArrayList<Integer> med = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < count.size(); i++) {
			
			int num = count.get(i);
			if (num != 0) {
				total++;
				if (num < min)
					min = num;
				else if (num > max)
					max = num;
				sum += num;
				if(map.get(num)!=null)
					map.put(num, (map.get(num) + 1));
				med.add(num);
			}
		}
		arr.add((double) min);
		arr.add((double) max);
		arr.add((double)(sum/total));
		
		Collections.sort(med);
		if(total%2 == 1) {
			arr.add((double) med.get(total/2));
		}else {
			int a = med.get(total/2);
			int b = med.get((total/2) -1);
			int med1 = (a+b)/2;
			arr.add((double)med1);
		}
		
		
		int occurence = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > occurence) {
				mode = entry.getKey();
			}
		}
		arr.add((double) mode);
		
		
		
		return arr;
	}

}
