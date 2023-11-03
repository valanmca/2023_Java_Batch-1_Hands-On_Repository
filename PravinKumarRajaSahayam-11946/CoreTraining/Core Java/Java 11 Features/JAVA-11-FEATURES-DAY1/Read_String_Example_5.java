//Java - 11 Var KeyWord Method
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
interface StringOper {
	String concat(String left, String right, String closes);
}
public class Read_String_Example_5 {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		StringOper s = (var left, var right, var closes) -> left + " " + right + " " + closes;
		String ops = s.concat("Hello", "World", "Suryas");
		System.out.println(ops);
	}

}
