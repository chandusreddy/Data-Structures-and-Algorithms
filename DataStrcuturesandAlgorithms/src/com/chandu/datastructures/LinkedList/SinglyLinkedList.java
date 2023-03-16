package com.chandu.datastructures.LinkedList;

/**
 *
 * @author @Chandu Implementing the SinglyLinked List and the internal details
 *         of the Linked List with the ListNode - Containing the Node -> Data is
 *         the actual value and the next which refers to the next Node.
 * 
 *         Following are the different method and the implementation details.
 *         #ListNode - Node that contains data and the next in a
 *         SinglyLinkedList. #Display() - Method for printing the List of values
 *         in a SinglyLinkedList. #findSLLLength() - Method for finding the
 *         length of a SinglyLinkedList. #insertFirst() - Method for Inserting
 *         the node at the Beginning of a SinglyLinkedList #insertLast() -
 *         Method for Inserting the node at the end of a SinglyLinkedList
 *         #insertatgivenPosition() - Method to insert node at a given valid
 *         Position. #DeleteFirst() - Method for deleting the node at the first
 *         in the Singly Linked List. #DeleteLast() - Method for deleting the
 *         node at the last in the Singly Linked List. #delete(int position) -
 *         Method for deleting the node at a given Position in the Singly Linked
 *         List #SearchData(int data) - Method for searching an element in the
 *         given Singkly Linked List
 * 
 * 
 * 
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

	// Method for inserting the node at the End of the Singly Linked List
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = newNode;

	}

	// Method for inserting the node at a given position
	public void insertatgivenPosition(int position, int value) {
		ListNode node = new ListNode(value);
		if (position == 1) {
			node.next = head;
			head = node;
		} else {

			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;

		}

	}

	public boolean isdataElement(int datakey) {
		ListNode current = head;
		while (current != null) {
			if (current.data == datakey) {
				return true;
			}
			current = current.next;

		}
		return false;
	}

	// Method for deleting a node at the first of the SinglyLinkedList
	public ListNode DeleteFirst() {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	// Method for deleting at the End of the SinglyLinkedList
	public ListNode DeleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;

	}

	// Method for deleting at the given Position
	public void delete(int position) {
		if (position == 1) {
			head = head.next;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;

		}

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
		sList.Display();
		System.out.println();
		System.out.println("Inserting the node at the End of the Linked List: ");
		sList.insertLast(66);
		sList.Display();
		System.out.println();
		System.out.println("Inserting the node at the End of the Linked List: ");
		sList.insertatgivenPosition(4, 999);
		sList.Display();
		System.out.println();
		System.out.println("Deleting the node at the First of the Singly Linked List: ");
		sList.DeleteFirst();
		sList.Display();
		System.out.println();
		System.out.println("Deleting the node at the Last of the Singly Linked List: ");
		sList.DeleteLast();
		sList.Display();
		System.out.println();
		System.out.println("Deleting the node at the given position 3 of the Singly Linked List: ");
		sList.delete(3);
		sList.Display();
		System.out.println();
		boolean status = sList.isdataElement(9);
		System.out.println("Searching if the given element is in the Singly Linked List and the Status is : " + status);
		sList.Display();

	}
}
