package com.demo.datastructure;

public class LinkedList {
	Node head;

	// public LinkedList() {
	// head = new Node();
	// head.value = 0;
	// head.next = null;
	// }

	public LinkedList(int value) {
		head = new Node();
		head.value = value;
		head.next = null;
	}

	public void insertFront(int item) {
		Node newNode = new Node();
		newNode.value = item;
		newNode.next = head;
		head = newNode;
	}

	public void showNodes() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println("node Values :" + temp.value);
			temp = temp.next;
		}
		System.out.println("node Values :" + temp.value);
	}

	public void sortList() {
		Node current = head, index = null;
		int temp;
		if (head == null) {
			return;
		} else {
			while (current != null) {
				index = current.next;
				while (index != null) {
					if (current.value < index.value) {
						temp = current.value;
						current.value = index.value;
						index.value = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}

	// public void sortList() {
	// // Node current will point to head
	// Node current = head, index = null;
	// int temp;
	//
	// if (head == null) {
	// return;
	// } else {
	// while (current != null) {
	// // Node index will point to node next to current
	// index = current.next;
	//
	// while (index != null) {
	// // If current node's data is greater than index's node data, swap the
	// // data between them
	// if (current.value > index.value) {
	// temp = current.value;
	// current.value = index.value;
	// index.value = temp;
	// }
	// index = index.next;
	// }
	// current = current.next;
	// }
	// }
	// }

	class Node {
		int value;
		Node next;
	}

}
