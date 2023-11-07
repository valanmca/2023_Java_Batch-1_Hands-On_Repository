package com.core.sealed;


sealed class SuperClass1 permits subclass1,subclass2,addition{
	
}
final class subclass1 extends SuperClass1{
	
}
non-sealed class subclass2 extends SuperClass1{
	
}
sealed class addition extends SuperClass1 permits Subtraction{
	
}
public class SealedClass {

	public static void main(String[] args) {

	}

}
