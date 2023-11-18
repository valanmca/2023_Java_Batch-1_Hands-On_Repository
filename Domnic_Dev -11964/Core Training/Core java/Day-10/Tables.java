package Core_Topic_Domnic_Day_10;

class Two extends Thread {
	public void run() {
		int n=2;
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
			try {
				Thread.sleep(2000+(i*11));
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("End Of Second Thread");
	}
}

class Four extends Thread {
	public void run() {
		int n=4;
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
			try {
				Thread.sleep(2000+(i*22));
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("End Of Four Thread");
	}

}

class Six extends Thread {
	public void run() {
		int n=6;
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
			try {
				Thread.sleep(2000+(i*33));
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("End Of Six Thread");
	}

}

public class Tables {

	public static void main(String[] args) {
      Two two=new Two();
      two.start();
      
      Four four=new Four();
      four.start();
      
      Six six=new Six();
      six.start();
	}

}
