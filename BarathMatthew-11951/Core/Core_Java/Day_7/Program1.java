package Day_7;

public class Program1 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
//		Three types of priorities
//		All the three priorities are default set to final static
		
		System.out.println(t.MIN_PRIORITY);//1
		System.out.println(t.NORM_PRIORITY);//5
		System.out.println(t.MAX_PRIORITY);//10
		
//		Before changing the thread name.
		
		System.out.println("Thread Name : "+t.getName());
		
//		After changing the thread name.
		t.setName("Matthew");
		
		System.out.println("Thread Name : "+t.getName());
		
//		Before changing the thread priority.
		
		System.out.println("Thread Priorty : "+t.getPriority());
		
//		After changing the thread priority.
		t.setPriority(8);
		
		System.out.println("Thread Priority : "+t.getPriority());
		
//		Setting priority not from limit.
//		t.setPriority(11);
//		
//		System.out.println("Thread Priority : "+t.getPriority());
		
// 		get state will give the current state 
		System.out.println(t.getState());
		
//		There are two way to create a thread class one is by extending Thread class and other is by implements Runnable  Interface
		
	}

}
