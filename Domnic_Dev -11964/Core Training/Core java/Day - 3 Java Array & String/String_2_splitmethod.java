package Core_Topic_Domnic_Day_3;

public class String_2_splitmethod {

	public static void main(String[] args) {
		
		
		String s1 = "Domnic";
		char ch[] = s1.toCharArray();

		for (char c : ch) {
			System.out.println(c); // for each loop
		}
		System.out.println();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]); // for loop
		}
		
		String s2="Welcome to the World of mark antony";
		String temp[]=s2.split("W");   //it will split it and remove the char
		
		for (String t: temp) {
			System.out.println(t);
		}
		
	}

}
