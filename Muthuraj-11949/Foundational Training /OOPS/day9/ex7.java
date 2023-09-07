package com.muthu.day9;

public class ex7 {
	   void myMethod1() {
		   System.out.println("Instance Method\n");
		   
	   }
	   static void myMethod2() {
		   System.out.println("Static Method");
		   
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex7 obj=new ex7();
		obj.myMethod1();
		
		ex7.myMethod2();

	}

}
