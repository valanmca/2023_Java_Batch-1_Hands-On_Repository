package com.purushoth.day_16;

sealed class SuperClass permits SubClassOne, SubClassTwo, SubClassThree {
	
}

final class SubClassOne extends SuperClass{
	//If it is final no need of permits
}
sealed class SubClassTwo extends SuperClass permits AnotherSubClass{
	//If it is sealed we need to use permits
	
}

non-sealed class SubClassThree extends SuperClass{
	//If it is non-sealed no need of permits
}

final class AnotherSubClass extends SubClassTwo{
	//If we use permit we need to extend it
}

public class SealedEg {

	public static void main(String[] args) {
		

	}

}
