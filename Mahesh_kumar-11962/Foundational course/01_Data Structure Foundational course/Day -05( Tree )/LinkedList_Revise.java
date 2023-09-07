package com.mahesh.ds_day5;

public class LinkedList_Revise {
        
        class Node{    //Inner Class
            int data;    
            Node next;   //Reference 
                
            public Node(int data) {    
            				   //Constructor 
            				  //Class name,Method name must be Same.
            				 //Constructor have no return type even void.
                this.data = data;    
                this.next = null;  
                	/* this keyword can be used 
                		to refer current class instance variable */
            }    
        }    
    
        public Node head = null;    
        public Node tail = null;    
            
        public void addNode(int data) {    
              
            Node newNode = new Node(data);  //Creation of New Node  
                
            if(head == null) {    
                
                head = newNode;    
                tail = newNode;    
            }    
            else {    
                
                tail.next = tail =newNode;    
             
                /*tail.next = newNode
                  tail=newNode            (eg : a=10;b=10; => a=b=10;)*/
            }    
        }    
            
           public void display() {    
            
            Node current = head;    
                
            if(head == null) {    
                System.out.println("your List is empty");    
                return;    
            }    
            System.out.println("Nodes in singly linked list: ");    
            while(current != null) {      
                System.out.print(current.data + " ");    
                current = current.next;    
                System.out.print(" -> ");
            }           
        }    
            
        public static void main(String[] args) {    
                
            LinkedList_Revise sll = new LinkedList_Revise();    
             System.out.println("Single Linked List\n");  
            
            sll.addNode(1);    
            sll.addNode(2);    
            sll.addNode(3);    
            sll.addNode(4);     
            sll.display();    
        }    
    	}


