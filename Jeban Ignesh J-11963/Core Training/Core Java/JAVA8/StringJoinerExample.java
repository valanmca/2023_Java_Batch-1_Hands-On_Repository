package com.jeban.JAVA8;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner(" ");
        sj1.add("Jeban");
        sj1.add("Ignesh");
        sj1.add("JJJJJJ");
        
        StringJoiner sj2 = new StringJoiner("","{","}");
        sj2.add("B");
        StringJoiner merging = sj1.merge(sj2);
        System.out.println(merging);
	}


}
