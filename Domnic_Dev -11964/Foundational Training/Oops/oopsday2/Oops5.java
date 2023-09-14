package com.domnic.day9;

public class Oops5 {
  int a=10;//instance or obj var
  
  static int b =20;//static or class var
	public static void main(String[] args) {
	
               Oops5 obj=new Oops5();
               System.out.println(obj.a+" + "+Oops5.b+" = "+(obj.a+Oops5.b));
	}

}
