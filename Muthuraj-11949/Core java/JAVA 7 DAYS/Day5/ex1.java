package Day5;

   

public class ex1 {
	int a=10;
	int b=40;//instance variable
	
	static int c=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ex1 obj1=new ex1();
		ex1 obj2=new ex1();
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(ex1.c);
		
		}
}
