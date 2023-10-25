package com.shiva.core.day07;

class MyCustomException extends Exception{
	
}
public class Custom {

	public static void main(String[] args) {
		
		try {
			
			throw new MyCustomException();
		}
		catch(MyCustomException e){
			System.out.println(e);
			
		}
	}

}
