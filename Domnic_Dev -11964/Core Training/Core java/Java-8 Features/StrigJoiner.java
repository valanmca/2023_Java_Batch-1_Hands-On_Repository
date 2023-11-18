package Java8;

import java.util.StringJoiner;

public class StrigJoiner {  
    public static void main(String[] args) {  

    	StringJoiner sj1=new StringJoiner(",","{","}");
    	
    	sj1.add("Domnic");
    	sj1.add("Mahesh");
    	sj1.add("Purush");
    	sj1.add("Madhan");
    	
    	System.out.println(sj1);
    	
StringJoiner sj2=new StringJoiner(" ","{","}");
    	
    	sj2.add("Domnic");
    	sj2.add("Mahesh");
    	sj2.add("Purush");
    	sj2.add("Madhan");
    	
    	System.out.println(sj2);
    	
    	StringJoiner merge=sj1.merge(sj2);
    	System.out.println(merge);
    	

    	
        
    }  
} 

