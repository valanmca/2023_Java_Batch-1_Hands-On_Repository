package com.gayathri.day5;

public class CommonLinkedList {

	// 1st initialize
	public Node head = null; //because we declare public so access anywhere in the program
	public Node tail = null;

	class Node { // Inner Class r nested class
		int data;
		Node next; // Reference // create a empty node

		public Node(int data) { // Constructor name same as class name
			this.data = data; // initialize
			this.next = null; //this is point the current data
		}//create a node with data and address
	}

	public void addNode(int data) { // function definition

		Node newNode = new Node(data);//object creation line of previous inner class "Node". 
		//because we need to initialize the data values and node value . 
		// so call the node class
		// new node is node class object

		if (head == null) { //1st node
			head = newNode;
			tail = newNode;
		} 
		else {
			//here, we move only tail pointer, because head always point 1st node, 
			//tail always point last node
			tail.next = newNode;
			//head.next = newNode; if this initialize...head always point 1st node 
			//so....head address always change.inter nodes will not display.
			tail = newNode;
		}
	}

	public void display() {

		Node current = head;
		// create new node variable and initialize the head

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;//point to the next node
		}

	}

	public static void main(String[] args) {
		CommonLinkedList sList = new CommonLinkedList();

		sList.addNode(10);// function call with 1 data
		sList.addNode(20);
		sList.addNode(30);
		sList.addNode(40);
		sList.display();

	}

}
