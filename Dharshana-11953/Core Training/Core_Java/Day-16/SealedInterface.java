package com.dharshu.day16;

sealed interface SealedInterfacees permits SubInterface,SubClass{
	//Sealed Super Interface
}

non-sealed interface SubInterface extends SealedInterfacees{
	//Non-Sealed Sub Interface
}

non-sealed class SubClass implements SealedInterfacees{
	//Non-Sealed Sub Class
}
public class SealedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
