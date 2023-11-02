package com.core.day_13;
import java.util.Optional;

public class OptionalKey {

	public static void main(String[] args) {
		
		String [] str =new String[10];
		
		str[5]="JAVA STRING";
		
		Optional<String > op=Optional.ofNullable(str[5]);
		
		if(op.isPresent())
		{
			String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
			
		}
		else
		{
			System.out.println("null");
		}

	}

}
