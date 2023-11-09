package com.jeyavel.coreDay7;

class twoT extends Thread{
	public void run() {
		int num=2;
		for(int i=1;i<=10; ++i) {
			System.out.println(num+"*"+ i+"="+ (num * i));
			try {
				Thread.sleep(2000+(i*11));
			} catch (InterruptedException e) {
			System.out.println("Two table is over");
			}
		}
	}
}
class fiveT extends Thread{
	public void run(){ 
	int num = 5;
    for(int i = 1; i <= 10; ++i)
    {
//    	System.out.println("%d * %d = %d \n", num, i, num * i);
    	System.out.println(num+"*"+ i+"="+ (num * i));
        try {
			Thread.sleep(2000+(i*22));
		} catch (InterruptedException e) {
			System.out.println("Five table is over");
		}
    }
  }
}

class sevenT extends Thread{
	public void run() {
		int num = 7;
		for(int i=1;i<=10;++i) {
//			System.out.println("%d * %d = %d \n",num , i, num * i);
			System.out.println(num+"*"+ i+"="+ (num * i));
				try {
					Thread.sleep(2000+(i*33));
				} catch (InterruptedException e) {
                    System.out.println("7 table is over");
				}
			
		}
	}
}

public class MultithreadingExercise1 {

	public static void main(String[] args) {
		twoT t1 = new twoT();
		t1.start();
		fiveT t2 = new fiveT();
		t2.start();
		sevenT t3 = new sevenT();
		t3.start();
		
		
		

	}

}
