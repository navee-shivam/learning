package com.demo.datastructure;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(1);
		linkedList.insertFront(5);
		linkedList.insertFront(7);
		linkedList.insertFront(6);
		linkedList.insertFront(9);
		linkedList.insertFront(2);

		linkedList.showNodes();

		linkedList.sortList();
		System.out.println("After sort");
		linkedList.showNodes();
	}
}
