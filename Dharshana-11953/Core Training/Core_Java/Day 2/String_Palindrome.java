package com.dharshu.day2;

public class String_Palindrome {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
        String a= new String(sb);
        StringBuffer ssb = new StringBuffer(sb.reverse());
        System.out.println(a);
        System.out.println(ssb);
        String b= new String(ssb);
        if(a.equals(b)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }

	}

}
