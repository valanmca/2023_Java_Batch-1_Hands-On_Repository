package DataStructureDay4;
import java.util.Queue;
import java.util.LinkedList;
public class queuebasic {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		
		//Inserting element in END/REAR
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println(queue);
		
		//Removing the 1st element from the FRONT
		queue.poll();
		System.out.println(queue);
		
		System.out.println(queue.size());//size of queue
		System.out.println(queue.peek());//first element in queue
		System.out.println(queue.isEmpty());//if it is empty
		System.out.println(queue.contains("C"));//whether c in queue
		

	}

}
