package Java_basic;

public class Biggest_of_three {

	public static void main(String[] args) {
		// using command line arguments
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		if(a>b) {
			if(a>c) {
				System.out.println("number 1 is biggest : "+ a);
			}
			else {
				System.out.println("number 3 is biggest : "+ c);
			}
		}
		else {
			if(b>c) {
				System.out.println("number 2 is biggest : "+ b);
			}
			else {
				System.out.println("number 3 is biggest : "+ c);
			}
		}

	}

}
