//Java - 17 sealed class
sealed class SuperClass permits SubClassOne, SubClassTwo, SubClassThree {
	// Sealed Super Class
}

final class SubClassOne extends SuperClass {

}

sealed class SubClassTwo extends SuperClass permits AnotherSubClass {

}

non-sealed class SubClassThree extends SuperClass {

}

final class AnotherSubClass extends SubClassTwo {

}

public class Java_17_Example_1 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
	}

}
