package DataStructureDay4;
import java.util.LinkedList;
import java.util.Queue;



public class sizequeue {

	public static void main(String[] args) {
        Queue<String> queue=new LinkedList<String>();
		
		//Inserting element in END/REAR
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println(queue);
		int count=0;
		
		while(!queue.isEmpty())
		{
			queue.poll();
			count++;
		}
		System.out.println(count);
		

	}

}
