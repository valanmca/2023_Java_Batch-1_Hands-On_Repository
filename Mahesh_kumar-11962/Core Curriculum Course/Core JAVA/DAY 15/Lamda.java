package com.mahesh.core_java_day_16_V8;
@FunctionalInterface
interface MyInterface
{
	int cal(int a,int b);
}

public class Lamda {

	public static void main(String[] args) {
		
		MyInterface sum = cal(10,b ->System.out.println(a+b));

	}

}
