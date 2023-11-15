package com.shiva.core.day15;

sealed interface SealedInterface permits SubInterface, SubClass {
	// Sealed Super Interface
}

non-sealed interface SubInterface extends SealedInterface {
	// Non-sealed Sub Interface
}

non-sealed class SubClass implements SealedInterface {
	// Non-sealed sub class
}

public class Sealed_Class_02 {

	public static void main(String[] args) {

	}

}
