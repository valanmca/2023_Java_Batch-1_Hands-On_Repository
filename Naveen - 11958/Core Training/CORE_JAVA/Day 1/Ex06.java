package com.naveen.day1;

/*java program to find biggest of three numbers using command line argument*/
public class Ex06 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        System.out.println("Number 1 : "+args[0]);
        System.out.println("Number 2 : "+args[1]);
        System.out.println("Number 3 : "+args[2]);
        if(n1>n2 && n1>n3)
            System.out.println("Number 1 - "+n1+" is the biggest number");
        else if(n2>n3)
            System.out.println("Number 2 - "+n2+" is the biggest number");
        else
            System.out.println("Number 3 - "+n3+" is the biggest number");
        }
}


