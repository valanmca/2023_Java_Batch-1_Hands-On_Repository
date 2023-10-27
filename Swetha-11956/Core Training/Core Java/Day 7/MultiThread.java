package Java7;

public class MultiThread {
	public static void main(String[] args) {
		Thread t= Thread.currentThread(); //currentThread is a predefined static method of Thread class
		System.out.println(t);  //Thread.currentThread - Displays current thread object
		System.out.println(t.getName());  //main
		System.out.println(t.getPriority());  //5
		System.out.println("");
		
		System.out.println(Thread.MIN_PRIORITY); //1
		System.out.println(Thread.MAX_PRIORITY); //10
		System.out.println(Thread.NORM_PRIORITY); //5
		System.out.println("");
		
		t.setName("Swe"); //setting thread name as "Swe"
		System.out.println(t.getName());  // Swe
		System.out.println(t);  //Thread[Swe,5,main]
		System.out.println("");
		
		t.setPriority(7);  //setting priority to 8
		System.out.println(t.getPriority());  // 7
		System.out.println(t);  //Thread[Swe,7,main]
		
		//Method to display the state of your thread...getState is a method from thread class.
		System.out.println(t.getState()); //Runnable
		
		
	} 

}
