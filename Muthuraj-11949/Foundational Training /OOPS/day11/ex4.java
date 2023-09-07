package com.muthu.day11;
public class ex4 {
	int n;//different parameter
		ex4()	
		{
		this(5);
	}
	ex4 (int n)
	{
		this.n=n;
		this.findfactorial();
}
	public void findfactorial()	
{
	int fact=1;
	for (int i=1; i<=n;i++) {
		fact=fact*i;}
		System.out.println("Factorial:"+fact);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ex4 obj=new ex4();
	}

}
