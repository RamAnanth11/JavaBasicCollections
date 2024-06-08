package com.codingninjas;

import java.util.ArrayList;

public class Circular {

	public static ArrayList<Integer> order(int n) {
		Node<Integer> first = new Node<Integer>(1);
		Node<Integer> curr = first;
		for (int i = 2; i <= n; i++) {
			curr.next = new Node<Integer>(i);
			curr = curr.next;
		}
//		(n/2==0? curr=first.next: curr=first);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		curr = first.next;
		for (int i = 1; i <= n; i++) {
			arr.add(curr.ele);
			curr = curr.next.next;
		}
		return arr;
	}

	public static void main(String[] args) {
		ArrayList<Integer> order = order(7);
		for (Integer i : order) {
			System.out.print(i + " ");
		}

	}
}

class Node<T> {
	Node next;
	int ele;

	public Node() {
		super();
	}

	public Node(int ele) {
		super();
		this.ele = ele;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getEle() {
		return ele;
	}

	public void setEle(int ele) {
		this.ele = ele;
	}

}
