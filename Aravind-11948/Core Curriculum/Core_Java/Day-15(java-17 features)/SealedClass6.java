package com.core.day_15;

sealed class SuperClass1 permits subclass1, subclass2,addition {
	// Sealed Super Class
}

 final class subclass1 extends SuperClass1 // using final keyword 
 {
	 
 }
 
 non-sealed class subclass2 extends SuperClass1 // using non sealed  keyword 
 {
	 
 }
 
 sealed class addition extends SuperClass1 permits subtraction{  // // using  sealed  keyword
	 
 }
 
 final class  subtraction extends addition{
	 
 }


public class SealedClass6 {

	public static void main(String[] args) {
   int a =017;
   System.out.println(a);
   
	}

}
