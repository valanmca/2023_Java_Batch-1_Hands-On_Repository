package com.jeyavel.day5;

public class LinkedListDemo {

	 class Node{    //Inner Class
         int data;   //variable 
         Node next;   //Reference 
             
         public Node(int data) {    //Constructor
             this.data = data;      //intilizing
             this.next = null;    
         }    
     }    
      
     
     public Node head = null;    
     public Node tail = null;    
         
        
     public void addNode(int data) {  //function definition  
           
         Node newNode = new Node(data);  //Creation of New Node  
             
             
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
         
         Node current = head;    
             
         if(head == null) {    
             System.out.println("List is empty");    
             return;    //it return null
         }    
         System.out.println("Nodes of singly linked list: ");    
         while(current != null) {    
                
             System.out.print(current.data + " ");    
             current = current.next; 
             System.out.print(" -> ");
         }    
             
     }    
         
     public static void main(String[] args) {    
             
         LinkedListDemo sList = new LinkedListDemo();    
             
         
         sList.addNode(10);    
         sList.addNode(20);    
         sList.addNode(30);    
         sList.addNode(40);    
             
             
         sList.display();    
     }    

}
