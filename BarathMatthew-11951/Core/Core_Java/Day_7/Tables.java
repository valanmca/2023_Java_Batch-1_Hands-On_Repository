package Day_7;

class Table2 extends Thread{
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" *"+"2"+" = "+(2*i));
			try {
				Thread.sleep(2000+(11));
			} catch (InterruptedException e) {
			}
		}
	}
}

class Table4 extends Thread{
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" *"+"4"+" = "+(4*i));
			try {
				Thread.sleep(2000+(22));
			} catch (InterruptedException e) {
			}
		}
	}
}

class Table6 extends Thread{
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" *"+"6"+" = "+(6*i));
			try {
				Thread.sleep(2000+(33));
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Tables {

	public static void main(String[] args) {
		Table2 two = new Table2();
		two.start();
		Table4 four = new Table4();
		four.start();
		Table6 six = new Table6();
		six.start();
	}

}
