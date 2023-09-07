package com.muthu.day5;

public class Ds {

        
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
            
           
        public void addNode(int data) {  //function definition  
              
            Node newNode = new Node(data);  //Creation of New Node  
                
                
            if(head == null) {   //1st node 
                
                head = newNode;    
                tail = newNode;    
            }    
            else {    
                
                tail.next = newNode;    
                tail = newNode;    
            }    
        }    
            
           public void display() 
           {    
            
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
                
            Ds sList = new Ds();    
                
            
            sList.addNode(10);    
            sList.addNode(20);    
            sList.addNode(30);    
            sList.addNode(40);    
                
                
            sList.display();    
        }    
    }
