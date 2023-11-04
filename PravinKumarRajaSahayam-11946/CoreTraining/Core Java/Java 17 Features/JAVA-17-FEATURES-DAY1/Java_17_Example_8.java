//Java - 17 Pattern Matching Method
public class Java_17_Example_8 {
	public static void main(String[] args) {
		//New way of pattern matchong method
		String object = "PravinKumar";
		if (object instanceof String str) {
			System.out.println(str.length());
		}
	}
}