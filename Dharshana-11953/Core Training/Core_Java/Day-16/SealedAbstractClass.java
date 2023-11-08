package com.dharshu.day16;

abstract sealed class SuperClass permits Subclass1,Subclass2,Subclass3{
	//Super class can be abstract and sealed
}

abstract final class Subclass1 extends SuperClass{
	//Compile Time Error: Sub class can't be final and abstract
}

abstract non-sealed class Subclass2 extends SuperClass{
	// Sub class can  be abstract and Non-Sealed
}

abstract sealed class Subclass3 extends SuperClass permits AnotherSubclass{
	// Sub class can be abstract and Sealed
}

final class AnotherSubclass extends Subclass3{
	//Final subclass of Subclass3
}
public class SealedAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
