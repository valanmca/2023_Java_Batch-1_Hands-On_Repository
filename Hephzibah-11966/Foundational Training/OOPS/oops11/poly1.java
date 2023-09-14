package oops11;

//Method Overloading
class MyClass{
	void myMethod(String name) {
		System.out.println("Welcome : " +name);	
}

void myMethod(int n) {
	int fact=1;
	for(int i=1; i<=n; i++) {
		fact=fact*i;
		
	}System.out.println("factorian : " +fact);
}

void myMethod(int a, int b) {
	int sum=a+b;
	System.out.println("sum : " +sum);	
}		
}

public class poly1 {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.myMethod(5);
		obj.myMethod(10,20);
		obj.myMethod("hephzi");
		

	}

}
