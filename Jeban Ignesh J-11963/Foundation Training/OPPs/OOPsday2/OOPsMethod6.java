package com.jeban.OOPsday2;//

public class OOPsMethod6 {
	
	void mymethod1(){
		System.out.println("Instance Method");
//		System.out.println("IM");
	}
	
	static void mymethod2() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		OOPsMethod6 obj1=new OOPsMethod6();//calling instance method by creating object
		obj1.mymethod1();
		//instance works with object value only
		
		OOPsMethod6.mymethod2();//calling static method with the help of class name
		//static works with class name not object

	}

}
