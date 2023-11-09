package com.jeyavel.coreDay5;
// Overriding is completely Based on Object reference
class _A{
	String msg = myMethod();
	String myMethod() {
		return "A";
	}
}
class _b extends _A{
	String myMethod() {
		return "B";
	}
}

public class InheritanceExNo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           _A obj = new _b();  //DMD implementation 
                    //Object creation
            System.out.println(obj.msg);
	}

}
