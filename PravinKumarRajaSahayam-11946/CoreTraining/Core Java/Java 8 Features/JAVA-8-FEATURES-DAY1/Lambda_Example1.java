//Java - 8 Lambda Expressions
//Functional Interfaces
interface MyInterface {
	int calc(int a, int b);
}

/*
 * //Addition class Addition implements MyInterface { public int calc( int a ,
 * int b ) { return a + b ; } }
 */
/*
 * //Substraction class Substraction implements MyInterface { public int
 * calc(int a , int b ) { return a + b ; } }
 */
public class Lambda_Example1 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		/*Addition obj = new Addition(50,60);
		obj.Addition();
		Substraction obj1 = new Substraction(70,80);
		obj1.Substraction();*/
		MyInterface sum = (a,b) -> a + b;
		System.out.println(sum.calc(10,20));
		MyInterface sub = (a,b) -> a - b;
		System.out.println(sub.calc(30,40));
		MyInterface div = (a,b) -> a / b;
		System.out.println(div.calc(500, 900));
	}

}
