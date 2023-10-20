//*** There are three types of variables 1)Instance 2)Static 3)Local

package com.jeban.ClassObject;

//Instance vs Static
public class Variables {
	static int a=10;//Static Variable
    int b=20;//Instance Variable

	public static void main(String[] args) {
		Variables obj1=new Variables();
		Variables obj2=new Variables();
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		
		obj1.a=20;
		
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//20
		
		
		

	}

}
