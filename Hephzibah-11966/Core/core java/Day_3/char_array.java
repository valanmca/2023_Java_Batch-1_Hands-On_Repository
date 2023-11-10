package Day_3;

public class char_array {

	public static void main(String[] args) {
		String s1="java";
		char ch[]= s1.toCharArray();
		for(char c:ch) {
		System.out.println(c);
	}
		String s2="Welcome to java program";
		String temp[]=s2.split(" ");
		for(String t:temp) {
			System.out.println(t);
		}
		

}
}
