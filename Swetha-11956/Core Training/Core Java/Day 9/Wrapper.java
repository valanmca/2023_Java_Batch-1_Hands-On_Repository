package JavaCollect9;

public class Wrapper {

	public static void main(String[] args) {

		int a=10;
		//Converting primitive value to object - Boxing
		Integer obj1=new Integer(a);
		
		//Extracting the primitive value from object - Unboxing
		int b=obj1.intValue();
		
		//JDK 1.5
		Integer obj2=a;  //Auto-boxing
		int c= obj2;  //Auto un-boxing
	}
	

}
