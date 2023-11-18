//Example for Sealed Classes with final and Non-sealed classes
package com.sara.CoreJava.Day_17;

sealed class SuperClass permits SubClassOne, SubClassTwo, Addition {

}

final class SubClassOne extends SuperClass {

}

non-sealed class SubClassTwo extends SuperClass {

}

sealed class Addition extends SuperClass permits Subtraction {

}

final class Subtraction extends Addition {

}

public class SealedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
