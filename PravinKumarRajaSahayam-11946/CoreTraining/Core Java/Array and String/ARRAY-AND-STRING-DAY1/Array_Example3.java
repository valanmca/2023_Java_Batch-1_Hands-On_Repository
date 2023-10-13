public class Array_Example3 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		String s1 = "Java";
		char ch[] = s1.toCharArray();// it will be converting the char to the char Array(Invoking the CharArray)
		for (char c : ch) { // This is a For Each Loop
			System.out.println(c);
		}

		String s4 = "Welcome to the Java Program";
		String temp[] = s4.split(" ");// It will split any delimeters like ( white space,character,string,values)
										// "split("J")
		for (String t : temp) {
			System.out.println(t);
		}
	}

}