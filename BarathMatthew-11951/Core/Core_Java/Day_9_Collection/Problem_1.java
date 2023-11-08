package Day_9_Collection;

public class Problem_1 {

	public static void main(String[] args) {
		
		int a = 10; //Primitive
		
//		Older way 
		
		Integer obj1 = new Integer(a); //Boxing

		int b = obj1.intValue(); //Un-Boxing
		
//		New Way (from From JDk 1.5)
		
		Integer Obj2 = a; //Auto Boxing
		
		int c= Obj2; //Auto Un-Boxing
	}

}
