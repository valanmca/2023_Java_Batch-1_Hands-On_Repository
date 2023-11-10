package Day_9;
//by default java is multithread programming language

public class multithread {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t); //Thread[main,5,main] main-name of the thread, 5-priority of main thread, main-thread group name
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		System.out.println(Thread.MIN_PRIORITY); //thread has predefined final static variables min,norm,max
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		
		t.setName("Hephzi");
		System.out.println(t.getName());
		System.out.println(t);
		
		t.setPriority(8);
		System.out.println(t.getPriority());
		System.out.println(t);
		
		System.out.println(t.getState());//get the state of the current method
		
		
	}

}
