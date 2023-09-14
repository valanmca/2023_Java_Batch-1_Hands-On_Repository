package DataStructureDay4;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class searchqueue {
	public static void main(String[] args) {
		
	
	Queue<String> queue=new LinkedList<String>();
	queue.offer("A");
	queue.offer("B");
	queue.offer("C");
	queue.offer("D");
	queue.offer("E");
	System.out.println(queue);
	System.out.println("enter the variable :");
	Scanner sc = new Scanner(System.in);
	String va= sc.next();
	boolean isPresent = false;
	while(!queue.isEmpty())
	{
		if(va.equals(queue.poll()))
		{
		System.out.println("yes");
		isPresent = true;
		break;}
		
	}
	if (!isPresent)
	{
		System.out.println("no");
	}
	

	
		// TODO Auto-generated method stub

	

}}
