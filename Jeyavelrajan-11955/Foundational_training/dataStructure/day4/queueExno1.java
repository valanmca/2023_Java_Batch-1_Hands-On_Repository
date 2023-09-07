package com.jeyavel.day4;
import java.util.Queue;
import java.util.LinkedList;
public class queueExno1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		//Inserting the element at the End/REAR
		queue.offer("A");//using .offer()Method to insert the element at the REAR Position
		queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        System.out.println(queue);
        
        queue.poll();//Remove first element from the FRONT
        System.out.println(queue);
        
        System.out.println("Output for size()             ="+queue.size());//3
        System.out.println("Output for Peek()             ="+queue.peek());//B
        System.out.println("Output for After using Poll() ="+queue); //[B,C,D]
        System.out.println("Output for isEmpty()          = "+queue.isEmpty());//False
        System.out.println("Output for Contains()         ="+queue.contains("A"));//False because poll() method removes the first element A
	    
       
	
	}

}
