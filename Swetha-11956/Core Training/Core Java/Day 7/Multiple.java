package Java7;


class Table implements Runnable{
	public void run() {
		int num1 = 5;
		for(int i=1;i<=10;i++) {
			System.out.println(i+" * "+num1+" = "+(i*num1));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
class Table2 implements Runnable{
	public void run() {
		int num2= 2;
		for(int i=1;i<=10;i++) {
			System.out.println(i+" * "+num2+" = "+(i*num2));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class Multiple {

	public static void main(String[] args) {

		Thread t1=new Thread(new Table());
		t1.start();
		
		Thread t2=new Thread(new Table2());
		t2.start();
				
		
	}

}
