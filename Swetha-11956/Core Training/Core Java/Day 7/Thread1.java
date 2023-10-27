package Java7;

public class Thread1 {

	public static void main(String[] args) throws InterruptedException{
		for (int i=0;i<5;i++) {
			System.out.println("Main thread is Running...");
			Thread.sleep(2000); //throws checked interrupted exception...Sleep is a predefined static method from thread class.
			
		}

	}

}
