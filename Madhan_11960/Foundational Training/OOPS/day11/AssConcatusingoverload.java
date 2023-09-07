package com.madhan.day11;

class MyConcatenation
{
	void concat(int a,int b)
	{
		System.out.println(a+""+b)	;
	}
	
	void concat(float a,float b)
	{
		System.out.println(a+""+b);
	}
	
	void concat(String a,String b)
	{
		System.out.println(a+""+b);
	}
}

public class AssConcatusingoverload {

	public static void main(String[] args) {
		MyConcatenation con=new MyConcatenation();
		con.concat(3, 3);
		con.concat(3.0f, 3.0f);
		con.concat("Mad", "han");

	}

}
