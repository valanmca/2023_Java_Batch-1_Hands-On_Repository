//    4. Write a Java program to print the pattern like below.
//*
//* *
//* * *
//* * * *
//* * * * *
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class JavaCoreBasic_Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,row=5;
for(i=0;i<row;i++)
{
	for(j=0;j<=i;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
}
	}
}
