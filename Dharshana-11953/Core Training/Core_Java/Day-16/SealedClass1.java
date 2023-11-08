package com.dharshu.day16;

sealed class SuperClass permits SubClassOne,SubClassTwo,SubClassThree{
	
}

final class SubClassOne extends SuperClass{
	
}

sealed class SubClassTwo extends SuperClass permits AnotherSubClass{
	
}

non-sealed class SubClassThree extends SuperClass{
	
}

final class AnotherSubClass extends SubClassTwo{
	
}
public class SealedClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
