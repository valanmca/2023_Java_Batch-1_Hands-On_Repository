package Day_9_Collection;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="" ;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		int temp =1;
		while (temp==1) {
			name = sc.next();
			for(int j=0;j<name.length();j++) {
				char q =name.charAt(j);
				char t ='.';
				if(q==t) {
					temp=0;
				}
				name +=name;
				}
			
		}
		
		age = sc.nextInt();
		System.out.println(name + "  "+age);
	}

}
