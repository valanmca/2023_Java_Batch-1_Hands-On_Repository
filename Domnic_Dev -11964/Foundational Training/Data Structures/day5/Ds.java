package com.domnic.day5;

public class Ds {

	class Node { // Inner Class
		int data;
		Node next; // Reference

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

		Ds sLList = new Ds();

		sLList.addNode(1);
		sLList.addNode(2);
		sLList.addNode(3);
		sLList.addNode(4);

		sLList.display();
	}
}