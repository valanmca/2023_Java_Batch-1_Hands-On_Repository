package oops11;
//Constructor overloading
class MyClass2{
	public MyClass2(String name) {
		this(5);
		System.out.println("Welcome : " +name);	
    }

    public MyClass2(int n) {
    	this(10,20);
	int fact=1;
	for(int i=1; i<=n; i++) {
		fact=fact*i;		
	}
	System.out.println("factorian : " +fact);
    }

    public MyClass2(int a, int b) {
	int sum=a+b;
	System.out.println("sum : " +sum);	
    }		
    }

public class poly5 {

	public static void main(String[] args) {
		MyClass2 obj1=new MyClass2("hephzi");
		/*MyClass1 obj2=new MyClass1(5);
		MyClass1 obj3=new MyClass1(10,20);*/
		


     }}

