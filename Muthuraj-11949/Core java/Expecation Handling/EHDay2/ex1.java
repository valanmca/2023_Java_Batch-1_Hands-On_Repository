package EHDay2;

public class ex1 {

	public static void main(String[] args) {
          Thread t=Thread.currentThread();
          
          System.out.println(t);
          System.out.println(t.getName());//main
          System.out.println(t.getPriority());//5
         // Thread if finally static three priority 
          
          System.out.println(Thread.MIN_PRIORITY);//1
          System.out.println(Thread.NORM_PRIORITY);//5
          System.out.println(Thread.MAX_PRIORITY);///10
          
          t.setName("Muthu");
          System.out.println(t.getName());
          System.out.println(t);
          
          System.out.println(8);
          System.out.println(t.getPriority());
          System.out.println(t);

          
              
          System.out.println(t.getState());//Runnable

          
	}

}
