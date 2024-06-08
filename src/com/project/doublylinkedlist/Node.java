package com.project.doublylinkedlist;

public class Node<T> {
	Node<T> next;
	Node<T> prev;
	Integer data;

	public Node() {
	}

	public Node(Integer data) {
		this.data = data;
	}

	public Node(Integer data, Node<T> prev, Node<T> next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

}
