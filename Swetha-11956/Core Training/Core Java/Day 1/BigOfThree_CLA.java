package oopsDay1_Day2;

public class BigOfThree_CLA {

	public static void main(String[] args) {

		int num1= Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1 +" is the biggest number among three given numbers");
			}
			
		}
		else if(num2>num3) {
			System.out.println(num2 +" is the biggest number among three given numbers");
		}
		else {
			System.out.println(num3 +" is the biggest number among three given numbers");
		}
		
	}

}
