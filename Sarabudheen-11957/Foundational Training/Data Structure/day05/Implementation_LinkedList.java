/************** Implementation of LinkredList... *************/
package com.sara.day05;

public class Implementation_LinkedList {

	class Node { // Inner Class
		int data;
		Node next;

		public Node(int data) { // Constructor
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		Node newNode = new Node(data); // Creation of New Node

		if (head == null) {

			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {

		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {

			System.out.print(current.data + " ");
			current = current.next;
		}

	}

	public static void main(String[] args) {

		Implementation_LinkedList list = new Implementation_LinkedList();

		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);

		list.display();

	}

}
