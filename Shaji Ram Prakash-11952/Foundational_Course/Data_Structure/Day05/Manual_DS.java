package com.shaji.Day05;

public class Manual_DS {
	
	 class Node{    //Inner Class
         int data;    
         Node next;   //Reference 
             
         public Node(int data) {    //Constructor
             this.data = data;    
             this.next = null;    
         }    
     }    
      
     
     public Node head = null;    
     public Node tail = null;    
         
        
     public void addNode(int data) {    
           
         Node newNode = new Node(data);  //Creation of New Node  
             
             
         if(head == null) {    // Works until head is null
             
             head = newNode;    
             tail = newNode;    
         }    
         else {    // If condition fails Else condition Works
             
             tail.next = newNode;    
             tail = newNode;    
         }    
     }    
         
        public void display() {    
         
         Node current = head;    
             
         if(head == null) {    
             System.out.println("List is empty");    
             return;    
         }    
         System.out.println("Nodes of singly linked list: ");    
         while(current != null) {    
                
             System.out.print(current.data + " ");    
             current = current.next;    
         }    
             
     }   
         
     public static void main(String[] args) {    
             
         Manual_DS list = new Manual_DS();    
             
         
         list.addNode(10);  //Adding newNode Values  
         list.addNode(20);    
         list.addNode(30);    
         list.addNode(40);    
             
             
         list.display();    
     }    
 }
	


