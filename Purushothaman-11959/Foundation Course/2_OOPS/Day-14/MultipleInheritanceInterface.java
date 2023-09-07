package com.purushoth.day14;

interface One{
	int a=10;    //public static final
}

interface Two{
	int a=20;   //public static final
}

interface Three extends One,Two {
	void addition() ;
}

class Calculate implements Three {
	public void addition() {
		System.out.println("Addition: "+(One.a + Two.a)); //Calling the static variables.
	}
}
public class MultipleInheritanceInterface {

	public static void main(String[] args) {
       Calculate obj=new Calculate();
       obj.addition();
	}

}// Multiple Inheritance Interface.
