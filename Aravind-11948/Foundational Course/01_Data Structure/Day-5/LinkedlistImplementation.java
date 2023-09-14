package com.aravind.day5;

import java.util.Scanner;

public class LinkedlistImplementation {
	class Node {
		int data;
		Node next;

		public Node(int data) {// constructor it doesnt have any return type counstructor name must be class
								// name

			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
		}
		System.out.print("Linked list=");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();

	}

	public static void main(String[] args) {

		LinkedlistImplementation list = new LinkedlistImplementation();
		System.out.println("linked list implementation");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of linked list");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int val = sc.nextInt();
			list.addNode(val);
		}
		/*
		 * list.addNode(10); list.addNode(20); list.addNode(30); list.display();
		 */
		list.display();

	}

}
