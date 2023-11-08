package com.dharshu.day16;

sealed interface SealedInterfaceF permits SubInterface1,SubInterface2,SubInterface3{
	//Sealed Super Interface
}

sealed interface SubInterface1 extends SealedInterfaceF permits SubClass{
	//Sealed Sub Interface
}

non-sealed class SubClass implements SubInterface1{
	//Non-Sealed SubClass implementing SubInterfaceOne
}

non-sealed interface SubInterface2 extends SealedInterfaceF{
	// Non-Sealed Sub Interface
}

final interface SubInterface3 extends SealedInterfaceF{
	//Compile Time Error : Permitted Sub Interface must not be final
}
public class SealedInterfaceFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
