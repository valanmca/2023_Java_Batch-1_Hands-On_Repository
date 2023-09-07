package DataStructureDay3;    //using the stack operations
import java.util.Stack;

public class stk {

	public static void main(String[] args) {     
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("The stack is : "+stack);
		System.out.println("Stack size is: "+stack.size());
		System.out.println("is the stack is empty :" +stack.isEmpty());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		System.out.println("size: "+ stack.size());
		
		stack.pop();
		System.out.println("after pop: " +stack);
		
		System.out.println("top element: " +stack.peek());
		
		System.out.println("is empty: " +stack.isEmpty());
		
		System.out.println("top element: " +stack);
		
		System.out.println("top element: " +stack.size());
		// TODO Auto-generated method stub

	}

}
