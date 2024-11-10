package com.collections.linkedlist;

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}

public class SinglyLinkedList {
	private Node<Object> first = null;
	private int count = 0;

	// Add an element to the end of the linked list
	public void add(Object e) {
		if (first == null) {
			first = new Node<Object>(e);
			count++;
			return;
		}
		Node<Object> curr = first;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node<Object>(e);
		count++;
	}

	// Add an element at the specific index of the linked list
	public void add(int index, Object e) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
//			first = new Node(e, first);
			Node<Object> n = new Node<Object>(e);
			n.next = first;
			first = n;
			count++;
			return;
		}
		Node<Object> curr = first;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
//		curr.next = new Node<Object>(e, curr.next);
		Node<Object> n = new Node<Object>(e);
		n.next = curr.next;
		curr.next = n;
		count++;
	}

	// Get the current size of the linked list
	public int size() {
		return count;
	}

	// Get the element at the specific index of the linked list
	public Object get(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		Node<Object> curr = first;
		for (int i = 1; i <= index; i++) {
			curr = curr.next;
		}
		return curr.data;
	}

	// Remove the element at the specific index of the linked list
	public void remove(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			first = first.next;
			count--;
			return;
		}
		Node<Object> curr = first;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		count--;
	}
}