import java.io.*;
interface StrOp
{
	String concat(String left,String right);
}
public class LambdaUsingVar {

	public static void main(String[] args) {
		StrOp s=(var left,var right) -> left + right;
		String op=s.concat("Good","Morning");
		System.out.println(op);
	}

}
