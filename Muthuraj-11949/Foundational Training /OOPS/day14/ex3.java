//Interface to Interface calling EXTENDS



package com.muthu.day14;
interface MyInterface3{
	void addition(int a,int b);
	void subtraction(int a,int b);	
}
interface MyInterface4 extends MyInterface3{
	void multiplication(int a,int b);
	void division(int a,int b);	
}
class Calculator2 implements MyInterface4{
  public  void addition(int a,int b) {
	  System.out.println("Addition:"+(a+b));
  }
  public void subtraction(int a,int b) {
	  System.out.println("subtraction:"+(a-b));
  }
  public  void multiplication(int a,int b) {
	  System.out.println("muliplication:"+(a*b));
  }
  public void division(int a,int b) {
	  System.out.println("division:"+(a/b));
  }
}


public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface4 obj=new Calculator2();//have we had create object for subclsss because we have 2.
		obj.addition(10, 20);
		obj.subtraction(20, 10);
		obj.multiplication(10,3);
		obj.division(20,2);

	}

}
