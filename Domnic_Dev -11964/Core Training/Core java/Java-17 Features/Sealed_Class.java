package Java17;

sealed class SuperClass permits SubClassOne,SubClassTwo,SubClassThree{
	
}
final class SubClassOne extends SuperClass{
	
}

sealed class SubClassTwo extends SuperClass permits AnotherSubClass{
	
}
final class AnotherSubClass extends SubClassTwo{
}


non-sealed class SubClassThree extends SuperClass
{
}


public class Sealed_Class {

	public static void main(String[] args) {

	}

}
