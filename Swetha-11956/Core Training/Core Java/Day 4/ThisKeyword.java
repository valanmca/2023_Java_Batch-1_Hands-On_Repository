package JavaOops4;
// we can stop inheritance by using final keyword, indirectly we can stop by using the private constructor.
//In object class, there is only one constructor which is default constructor.
class X{
	X(){
		System.out.println("A");
	}
	X(int a){
		System.out.println("A 1");
	}
}
class Y extends X{
	Y(){
		//Default constructor is not always optional.it is optional when there is no constructor in super class.
		super();  
		System.out.println("B");
	}
	Y(int a){
		this();
		System.out.println("B 1");
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		Y obj=new Y(5);
	}

}
