//Multithreading for the get State
public class Multithreading_Example5 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		// This is Pre-defined Static Method or Variables we can not change and the increase the values
		System.out.println(Thread.MIN_PRIORITY); // 1
		System.out.println(Thread.NORM_PRIORITY); // 5
		System.out.println(Thread.MAX_PRIORITY); // 10

		t.setName("PravinKumar");
		System.out.println(t.getName());
		System.out.println(t);

		t.setPriority(8);
		System.out.println(t.getPriority());
		System.out.println(t);
//getState is the Method for the display the state of the thread
		System.out.println(t.getState());
	}

}
