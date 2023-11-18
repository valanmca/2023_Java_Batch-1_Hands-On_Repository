package Core_Topic_Domnic_Day_6;

class A{
	A(){
		System.out.println("A");
		}
	A(int a){
		System.out.println(" A 1");
	}
}
class B extends A{
	
	B(){                   //by default if we use extends super class default constructor will be called. 
		super(5);        //if we pass argument means it will call the respective super class constructor
		System.out.println("B");
	}
}

public class inheritance_1 {

	public static void main(String[] args) {
     B obj=new B();
     
	}

}
