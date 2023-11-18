package com.purushoth.day_16;

sealed interface SuperClass1 permits SubClassOne1, SubClassTwo1, SubClassThree1 {
	
}

non-sealed interface SubClassOne1 extends SuperClass1 {
	//We need to use non-sealed or sealed in interface we can't able to give final
}
sealed interface SubClassTwo1 extends SuperClass1 permits AnotherSubClass1{
	//If it is sealed we need to use permits
	
}

non-sealed interface SubClassThree1 extends SuperClass1{
	//If it is non-sealed no need of permits
}

non-sealed interface AnotherSubClass1 extends SubClassTwo1{
	//If we use permit we need to extend it
}

public class SealedInterfaceEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
