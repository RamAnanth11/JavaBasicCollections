package com.thread.learning;

import java.util.ArrayList;
import java.util.List;

public class CheckPallindrome {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Ananth","Physics");
		Employee emp2=new Employee(102,"Abdul","Java");
		
		List<Employee> empList=new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		
		empList.stream().map(e->e.getDepartment()).forEach(e->System.out.println(e));;
		
		
		String str = "mallam";
		System.out.println(isPallindrome(str));
		System.out.println(str.length());

	}

	static boolean isPallindrome(String str) {
		int i = 0, j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
