package com.jeyavel.day2;
import java.util.ArrayList;
public class Arraylist {
	public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Size" + list.size());
        System.out.println(list);

        list.add(10);//Adding elements in end
        System.out.println("size"+ list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        //Printing the list after adding the elements
        System.out.println("size :"+ list.size());
        System.out.println("the list is :"+list);

        list.remove(2);//remove() is used to remove the specific index of the array list

        //Printing the list after Remove the element
        System.out.println("size:"+ list.size());
        System.out.println("the list is :"+list);


        list.add(0,34);//add() is used to add the elements in the specific index of the array list 

        //Printing the list after adding middle of the array list
        System.out.println("size :"+ list.size());
        System.out.println("the list is :"+list);
        
        list.add(3,90);
        System.out.println("size :"+ list.size());
        System.out.println("the list is :"+list);
        
        list.set(3, 56);//update a element 
        System.out.println(list);
        
        System.out.println(list.get(3));//get () is the function to get the value after update the element 
        
        System.out.println("Array Elements are :");//Traversing 
        for (int i=0;i< list.size();i++) {
        
        	System.out.println("\n"+list.get(i));
        }
        


	}
}
