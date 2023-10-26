//Multithreading for the getName and getPriority
public class Multithreading_Example2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName()); // main
		System.out.println(t.getPriority()); // 5

	}

}
