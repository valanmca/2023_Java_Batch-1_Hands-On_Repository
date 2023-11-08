package Day_6;

//Multi Threading
//We have to use join so that the main thread statement run after multi(child) threads
//we can use isAlive to check if the thread is still running or stopped. 

class Words extends Thread{
	public void run() {
		for(int i =1;i<=5;i++) {
//			creating delay
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello");
		}	
	}
}

class Numbers extends Thread{
	public void run() {
		for(int i = 1;i<=5;i++) {
//			creating delay
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}	
	}
}

public class MulThread {
	public static void main(String[] args) throws InterruptedException {
	Words w = new Words();
	Numbers n =new Numbers();	
	w.start();
	n.start();
	
	System.out.println(w.isAlive());
	w.join();
	n.join();
	System.out.println(w.isAlive());
	System.out.println("Running from main thread");
	System.out.println("Same");
	}
}
