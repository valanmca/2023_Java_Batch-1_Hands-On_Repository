package com.naveen.day_15;

sealed class SuperClass permits SubClassOne, SubClassTwo, Addition{
	
}

final class SubClassOne extends SuperClass{
	
}

non-sealed class SubClassTwo extends SuperClass{
	
}

sealed class Addition extends SuperClass permits Subtraction{
	
}

final class Subtraction extends Addition{
	
}



public class Ex01_Sealed {

	public static void main(String[] args) {
		
	}

}
