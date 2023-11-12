package Java8;
//Lambda expression - reducing the number of lines of code

//Lambda expressions are anonymous functions

@FunctionalInterface //- contains exactly one abstract method

interface MyInterface{
	int calc(int a,int b);
}
public class Example1 {

	public static void main(String[] args) {
		
		//reduced writing two different function sum and sub.
		
		MyInterface sum=(a,b)-> a+b ;
		System.out.println(sum.calc(10,20));
		
		MyInterface sub=(a,b)-> a-b ;
		System.out.println(sub.calc(10,20));
	}

}
