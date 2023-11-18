package Core_Topic_Domnic_Day_10;

public class MultiThr {

	public static void main(String[] args) {
    Thread t=Thread.currentThread();
    System.out.println(t);
    System.out.println("Thread name : "+t.getName());
    System.out.println("Thread priority : "+t.getPriority());

    System.out.println(Thread.MIN_PRIORITY);
    System.out.println(Thread.NORM_PRIORITY);
    System.out.println(Thread.MAX_PRIORITY);

    t.setName("Domnic");    //changing thread name
    System.out.println("Thread name : "+t.getName());
    System.out.println(t);
    
    t.setPriority(7);           //changing priority
    System.out.println("Thread priority : "+t.getPriority());
    System.out.println(t);

    System.out.println(t.getState());

	}

}
