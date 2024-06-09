package com.collections.linkedlist;

public class LinkedList<T> {

	private Nodes<Integer> head;
	private int count;

	public Nodes<?> add(int ele) {
		if (head == null) {
			head = new Nodes<Integer>(ele);
			count++;
			return head;
		}
		Nodes<Integer> curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Nodes<Integer>(ele);
		count++;
		return head;
	}

	public Nodes<?> add(int pos, int ele) {
		if (pos > count) {
			throw new IndexOutOfBoundsException();
		}
		if (pos == 0) {
			Nodes<Integer> Nodes = new Nodes<Integer>(ele);
			Nodes.next = head;
			head = Nodes;
			count++;
			return head;
		}

		Nodes<Integer> curr = head;
		for (int i = 1; i <= count; i++) {
			if (i == pos) {
				Nodes<Integer> Nodes = new Nodes<Integer>(ele);
				Nodes.next = curr.next;
				curr.next = Nodes;
				count++;
			}
			curr = curr.next;
		}
		return head;
	}

	public int size() {
		return count;
	}

	public void display() {
		if (head != null) {
			Nodes<Integer> curr = head;
			while (curr != null) {
				System.out.print(curr.ele + " ");
				curr = curr.next;
			}
		}
	}

	public boolean remove(int pos) {
		if (pos >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (pos == 0) {
			head = head.next;
			count--;
			return true;
		}
		Nodes<Integer> curr = head;
		int index = 1;
		while (index < pos) {
			curr = curr.next;
			index++;
		}
		curr.next = curr.next.next;
		count--;
		return true;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(6, 15);
		System.out.println(list.size());
		list.display();
//		list.remove(5);
//		System.out.println();
//		System.out.println(list.size());
//		list.display();

	}

}

class Nodes<T> {
	Nodes<T> next;
	int ele;

	public Nodes(int ele) {
		this.ele = ele;
	}

	public Nodes<T> getNext() {
		return next;
	}

	public void setNext(Nodes<T> next) {
		this.next = next;
	}

	public int getEle() {
		return ele;
	}

	public void setEle(int ele) {
		this.ele = ele;
	}

}