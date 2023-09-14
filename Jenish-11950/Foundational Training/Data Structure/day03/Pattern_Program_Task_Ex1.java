package com.jenish.day03;
import java.util.Scanner;
//Pattern [Use Only One Loop]
/*
 * *
 * **
 * ***
 * ****
 * *****
 * *******/
public class Pattern_Program_Task_Ex1 {

	public static void main(String[] args) {
		String star = "";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the values: ");
        int value = sc.nextInt();
        
        for (int i=0; i<value; i++)
            {
            star=star+"*";
        System.out.println(star);
        }
        sc.close();

    }
		
		
	}

