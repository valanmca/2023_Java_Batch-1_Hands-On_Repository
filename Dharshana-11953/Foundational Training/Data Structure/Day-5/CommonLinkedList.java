package com.dharshu.day5;

public class CommonLinkedList {
	
	 public Node head = null;    
	    public Node tail = null;  
	    
	class Node{    //Inner Class
        int data;    
        Node next;   //Reference name
        //"next" store the next node address
            
        public Node(int data) {    //Constructor
            this.data = data;    
            this.next = null;    
        }    
    }    
        
       
    public void addNode(int data) {   //function definition 
          
        Node newNode = new Node(data);  //Creation of New Node  
         //call the node class   
         //newNode is a object of node class
        //after this constructor will execute
        
        
        if(head == null) {    
            
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            
            tail.next = newNode;    
            tail = newNode;    
        }    
    }    
        
       public void display() {    
        
        Node current = head;    //current points the 1st node "10"
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {   //run until the current become null 
               
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
            
    }    
        
    public static void main(String[] args) {    
            
    	CommonLinkedList sList = new CommonLinkedList();    
            
        
        sList.addNode(10);    
        sList.addNode(20);    
        sList.addNode(30);    
        sList.addNode(40);    
            
            
        sList.display();    
    }    
}