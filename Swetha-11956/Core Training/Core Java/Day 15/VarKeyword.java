package Java11;
import java.io.*;

interface StringOper{
String concat(String left,String right);
}
public class VarKeyword {

	public static void main(String[] args) {

		StringOper s = (var left,var right)->left+right;
		String op=s.concat("Hello", " world");
		System.out.println(op);
	}

}
