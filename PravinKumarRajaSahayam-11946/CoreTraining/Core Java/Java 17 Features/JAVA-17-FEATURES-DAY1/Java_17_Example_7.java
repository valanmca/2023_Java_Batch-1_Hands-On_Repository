//Java - 17 Pattern Matching Method
public class Java_17_Example_7 {
	public static void main(String[] args) {
		//Old way of pattern matchong method
		String object = "PravinKumar";
		if (object instanceof String) {
			String str = (String) object;
			System.out.println(str.length());
		}
	}
}