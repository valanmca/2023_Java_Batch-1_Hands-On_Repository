package Day_7;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1;i<=5;i++) {
			System.out.println("Main Thread is running ..........");
			Thread.sleep(2000);
			System.out.println("Main Thread is running After..........");
		}

	}

}
