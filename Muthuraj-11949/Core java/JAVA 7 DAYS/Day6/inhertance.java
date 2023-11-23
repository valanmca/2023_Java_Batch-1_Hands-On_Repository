package Day6;

/// Default Constructor non Optional in Java 

//Constructor default calling superclass maintain value Super keyword 

//// This mention it Calling  with 
class A{
	A(){/// Without arguments
		System.out.println("A");
	}
	A(int a){ ///with arguments
		System.out.println("A 1");
	}	
}

class B extends A{
	B(){
		super(5);
		System.out.println("B");
	}
	B(int a){
		this();
		System.out.println("B 1");		
	}
}
public class inhertance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B(5);
	}

}
