package com.codingninjas;

import java.math.BigDecimal;

public class AddingTheLinkedLists {

	public static void main(String[] args) {
		// Example usage:
		BigDecimal abc= new BigDecimal(10000);
		BigDecimal abcd= new BigDecimal(1000 );
		int rest=abc.compareTo(BigDecimal.ZERO);
		System.out.println("res "+rest);
		int res=abc.compareTo(abcd);
		System.out.println("res "+res);
		ListNode<Integer> first = new ListNode<>(2);
//		first.next = new ListNode<>(2);
//		first.next.next = new ListNode<>(3);
//		first.next.next.next = new ListNode<>(0);
//		first.next.next.next.next = new ListNode<>(5);

		ListNode<Integer> second = new ListNode<>(8);
//		second.next = new ListNode<>(5);

		ListNode<Integer> result = addTwoLists(first, second);

		// Printing the result
		while (result != null) {
			System.out.print(result.data + " ");
			result = result.next;
		}
	}

	public static ListNode<Integer> addTwoLists(ListNode<Integer> first, ListNode<Integer> second) {

		if (first == null) {
			return second;
		} else if (second == null) {
			return first;
		}
		int firstSum = 0;
		ListNode<Integer> firstCurr = first;
		while (firstCurr != null) {
			firstSum = (firstSum * 10) + firstCurr.data;
			firstCurr = firstCurr.next;
		}
		int secondSum = 0;
		ListNode<Integer> secondCurr = second;
		while (secondCurr != null) {
			secondSum = (secondSum * 10) + secondCurr.data;
			secondCurr = secondCurr.next;
		}
		System.out.println(firstSum + " " + secondSum);
		int sum = firstSum + secondSum;
		System.out.println(sum);
		ListNode<Integer> dummyHead = new ListNode<>(-1);
		ListNode<Integer> current = dummyHead;
		ListNode<Integer> newNode = null;
		while (sum > 0) {
			int digit = sum % 10;
			sum /= 10;
			newNode = new ListNode<>(digit);
			current.next = newNode;
			current = current.next;
		}
		return dummyHead.next;
	}
}

class ListNode<T> {

	public T data;
	public ListNode<T> next;

	public ListNode(T data) {
		this.data = data;
	}
}
