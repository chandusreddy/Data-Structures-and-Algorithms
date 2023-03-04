package com.chandu.datastructures.LinkedList;

/**
 *
 * @author @Chandu Implementing the SinglyLinked List and the internal details
 *         of the Linked List with the ListNode - Containing the Node -> Data is
 *         the actual value and the next which refers to the next Node.
 */
public class SinglyLinkedList {

	ListNode head;

	static class ListNode {
		private int data; // Generic Type
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;

		}
	}

// Method for displaying the values in the Singly Linked List Nodes
	public void Display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");

	}

	// Method for finding the length of the Singly Linked List
	public int findSLLLength() {

		if (head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;

	}

	// Method for inserting the node at the Beginning of the Singly Linked List
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		SinglyLinkedList sList = new SinglyLinkedList();
		sList.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(9);
		// Connecting the nodes by assigning the next value to the next node
		sList.head.next = second;
		second.next = third;
		third.next = fourth;

		System.out.println("Printing the values of the SinglyLinkedList : ");
		sList.Display();
		System.out.println();
		int length = sList.findSLLLength();
		System.out.println("Printing the Length of the  SinglyLinkedList : " + length);
		System.out.println();
		System.out.println("Inserting the node at the Beginning of the Linked List: ");
		sList.insertFirst(44);
		System.out.println();
		System.out.println("After Inserting at the Beginning of the Linked List: ");
		System.out.println();
		sList.Display();

	}
}
