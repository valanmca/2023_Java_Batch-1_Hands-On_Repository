//Java - 8 String Joiner
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
public class Lambda_Example4 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		StringJoiner obj = new StringJoiner(",", "{", "}");
		obj.add("Pravins");
		obj.add("Kumar");
		obj.add("Raja");
		obj.add("Sahayam");
		StringJoiner obj4 = new StringJoiner(" ", "[", "]");
		obj4.add("Surya");
		obj4.add("Pravins");
		obj4.add("PravinKumar");
		obj4.add("PravinsKumar");
		StringJoiner merging = obj4.merge(obj);
		System.out.println(merging);
	}

}
