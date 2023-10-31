package EHDay2;
class Sum extends Thread{
public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("3 * "+i+"=" + 3 * i);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
	}
	}
}
 }

class Mul extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("4 * "+i+"=" + 4 * i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}}}

class Add extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("5 *"+i+"=" +5*i);
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e) {}
		}
	}
}
public class Ex8 {
   public static void main(String[] args) throws InterruptedException {
		
		Sum obj=new Sum();	
		Mul obj2=new Mul();
		Add obj3=new Add();
		
	    obj.start();
	    obj2.start();
	    obj3.start();

	}		
}


