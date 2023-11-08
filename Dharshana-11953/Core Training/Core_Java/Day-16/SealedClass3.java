package com.dharshu.day16;

sealed class SuperClass permits SubClass1,SubClass2{
	// Sealed Super Class
}

final class SubClass1{
	//Compile Time Error : It must be extends SuperClass
}

non-sealed class SubClass2{
	//Compile Time Error : It must be extends SuperClass
}
public class SealedClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
