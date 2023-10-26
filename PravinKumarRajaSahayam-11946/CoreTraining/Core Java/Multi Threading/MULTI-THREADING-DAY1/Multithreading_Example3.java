//Multithreading three constant Priority
public class Multithreading_Example3 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		// Static Method or Variables we can not change and the increase the values
		System.out.println(Thread.MIN_PRIORITY); // 1
		System.out.println(Thread.NORM_PRIORITY); // 5
		System.out.println(Thread.MAX_PRIORITY); // 10

	}

}
