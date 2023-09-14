//ManualImplementation

package com.jeyandhan.day05;

public class ManualImplementation {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);

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
		ManualImplementation mi = new ManualImplementation();

		mi.addNode(10);
		mi.addNode(20);
		mi.addNode(30);

		mi.display();

	}

}
