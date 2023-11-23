package Day_3;

public class stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java";
		char ch[]= s1.toCharArray();
		for(char c :ch) {
			System.out.println(c);
			
		}

		
		String s2="Welcome to java Program";
		String temp[]=s2.split("j");
		for(String t: temp) {
			System.out.println(t);
		}
		
	}

}
