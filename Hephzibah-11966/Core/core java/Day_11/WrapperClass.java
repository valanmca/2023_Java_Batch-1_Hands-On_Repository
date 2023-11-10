package Day_11;

public class WrapperClass {

	public static void main(String[] args) {
		int a=10; //Primitive
		
		Integer obj1=new Integer(a); //Boxing
		int b=obj1.intValue(); //Unboxing
		
		//JDK 1.5
		Integer obj2=a; //Auto-Boxing
		int c=obj2; //Auto-Un-Boxing
	}

}
