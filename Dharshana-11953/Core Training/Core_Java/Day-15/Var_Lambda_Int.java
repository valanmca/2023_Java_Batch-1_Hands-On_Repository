package com.dharshu.day15;



interface VarInt{
	int calc(int a,int b);
}
public class Var_Lambda_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarInt sum = (var a,var b) -> a+b;
		VarInt sub = (var a, var b) -> a-b;
		System.out.println("Addition:"+sum.calc(10, 20));
		System.out.println("Subtraction:"+sub.calc(20, 10));
	}

}
