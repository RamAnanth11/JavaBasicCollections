package com.project.doublylinkedlist;

public class DoublyLinkedList {
	private Node<Integer> head;
	private Node<Integer> last;
	private Integer count = 0;

	public Integer size() {
		return count;
	}

	public Node<?> add(int data) {

		if (head == null) {
			Node<Integer> node = new Node<Integer>(data);
			head = node;
			last = head;
			count++;
			return head;
		}
		last.next = new Node<Integer>(data, last, null);
		last = last.next;
		count++;
		return head;
	}

	public Node<?> add(int pos, int data) {
		if (pos > count) {
			throw new IndexOutOfBoundsException();
		}

		if (pos == 0) {
			head.prev = new Node<Integer>(data, null, head);
			head = head.prev;
			count++;
			return head;
		}
		if (pos == count) {
			last.next = new Node<Integer>(data, last, null);
			last = last.next;
			count++;
			return head;
		}

		Node<Integer> curr = head;
		for (int i = 1; i < pos; i++) {
			curr = curr.next;
		}
		Node<Integer> node = new Node<Integer>(data, curr, curr.next);
		curr.next.prev = node;
		curr.next = node;
		count++;
		return head;
	}
	
	public Node<?> remove(int pos){
		if(pos >= count && pos < 0) {
			throw new IndexOutOfBoundsException();
		}
		if(pos == 0) {
			if(head.next!=null) {
				head = head.next;
				head.prev = null;
				count--;
				return head;
			}
			else {
				head = null;
				last = null;
				count--;
				return head;
			}
		}
		if(pos == count-1) {
			last = last.prev;
			last.next = null;
			count--;
			return head;
		}
		Node<Integer> curr = head;
		for(int i = 1; i < pos; i++) {
			curr = curr.next;
		}
		curr.next.next.prev = curr;
		curr.next = curr.next.next;
		count--;
		return head;
	}

	public void displayForward() {
		Node<Integer> curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public void displayReverse() {
		Node<Integer> curr = last;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.prev;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(10);
		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//		list.add(60);
		System.out.println(list.size());
		list.displayForward();
		list.displayReverse();
//		list.add(2, 100);
//		System.out.println(list.size());
//		list.displayForward();
//		list.displayReverse();
		list.remove(0);
		System.out.println(list.size());
		list.displayForward();
		list.displayReverse();

	}

}
