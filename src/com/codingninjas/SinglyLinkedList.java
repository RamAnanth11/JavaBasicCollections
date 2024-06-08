package com.codingninjas;

public class SinglyLinkedList {
	public static void main(String[] args) {
		// Create a sample linked list
		Nodes head = new Nodes(1);
		head.next = new Nodes(2);
		head.next.next = new Nodes(3);
		head.next.next.next = new Nodes(4);
		head.next.next.next.next = new Nodes(2);
		head.next.next.next.next.next = new Nodes(5);
		head.next.next.next.next.next.next = new Nodes(2);

		// Print the original linked list
		System.out.println("Original Linked List:");
		printLinkedList(head);

		// Remove Nodess with value k = 2
		int k = 2;
		head = removeNodes(head, k);

		// Print the modified linked list
		System.out.println("\nLinked List after removing Nodess with value " + k + ":");
		printLinkedList(head);
	}
	
	public static void printLinkedList(Nodes head) {
        Nodes current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
	 public static Nodes removeNodes(Nodes head, int k) {
	        while(head != null && head.data ==k)
	            head = head.next;
	        Nodes curr = head;
	        Nodes prev = null;
	       
	       while(curr != null){
	           if(curr.data == k){
	               if(prev != null){
	                    prev.next = curr.next;
	                    curr = curr.next;
	                }
	           }
	           else{
	               prev = curr;
	               curr = curr.next;
	           }
	        }

	        return head;
	    }
}

class Nodes {
	public int data;
	public Nodes next;

	Nodes(int data) {
		this.data = data;
		this.next = null;
	}
};
