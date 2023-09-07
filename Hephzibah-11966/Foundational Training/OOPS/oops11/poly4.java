package oops11;
//Constructor overloading
class MyClass1{
	public MyClass1(String name) {
		System.out.println("Welcome : " +name);	
}

    public MyClass1(int n) {
	int fact=1;
	for(int i=1; i<=n; i++) {
		fact=fact*i;
		
	}System.out.println("factorian : " +fact);
}

    public MyClass1(int a, int b) {
	int sum=a+b;
	System.out.println("sum : " +sum);	
}		
}

public class poly4 {

	public static void main(String[] args) {
		MyClass1 obj1=new MyClass1("hephzi");
		MyClass1 obj2=new MyClass1(5);
		MyClass1 obj3=new MyClass1(10,20);
		


}}
