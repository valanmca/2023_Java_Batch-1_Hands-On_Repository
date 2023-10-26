package JavaBasics3;

public class CharArray {

	public static void main(String[] args) {

		String s1="Java";
		char ch[]=s1.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}
		
		//Splitting the strings
		System.out.println("");
		
		String s2="Welcome to java program";
		String temp[]=s2.split("j");  //Splitting based on 'j' and storing it in temp[].
		for(String t: temp) {
			System.out.println(t);
		}
		System.out.println("");
		String s3="Welcome to java program";
		String temp1[]=s3.split(" ");  //Splitting based on 'white space' and storing it in temp1[].
		for(String t: temp1) {
			System.out.println(t);
		}
	}

}
