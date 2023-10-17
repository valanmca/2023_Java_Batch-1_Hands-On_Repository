//Method OverRiding using with declare
class A100 {
	String msg = myMethod();
	String myMethod() 
	{
		return "A";
	}
}
class B100 extends A100 {
String myMethod() 
{
	return "B";
}
}
public class Inheritance_Example12 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
A100 objs = new B100();
System.out.println(objs.msg);
	}

}

