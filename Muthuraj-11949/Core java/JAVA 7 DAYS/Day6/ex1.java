package Day6;

/// static
class C{
	int a=10;
	static void display() {
		System.out.println("C");
	}
}
class D extends C{
	int a= 20 ;
	static void display() {
		System.out.println("D");
	}
	
}
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    C obj=new D();
    obj.display();
    System.out.println(obj.a);
    
	}

}
