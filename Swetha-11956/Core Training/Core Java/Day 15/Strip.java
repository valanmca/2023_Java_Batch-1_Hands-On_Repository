package Java11;
//Java strip method...
public class Strip {

	public static void main(String[] args) {

		String str="\t This is java Strip method   ";
		System.out.println(str);
		System.out.println(str.strip()); //remove the spaces
		
		System.out.println("");
		
		//stripLeading() method  //does not remove the last space
		String str1="\t This is java Strip method   ";
		System.out.println(str1);
		System.out.println(str1.stripLeading());
		
		System.out.println("");
		
		//stripTrailing() --> removes trailing or end spaces.
		String str2="\t This is java Strip method\t";
		System.out.println(str2);
		System.out.println(str2.stripTrailing());
		}

}
