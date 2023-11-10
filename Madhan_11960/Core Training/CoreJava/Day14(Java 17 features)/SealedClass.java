package com.madhan.java17;

sealed class superClass permits subClassTwo,subClassThree
{
	
}

non-sealed class subClassThree extends superClass
{
	
}

sealed class subClassTwo extends superClass  permits subClassOne
{
	
}

final class subClassOne extends subClassTwo 
{
	
}

public class SealedClass {

	public static void main(String[] args) {
		
	}

}
