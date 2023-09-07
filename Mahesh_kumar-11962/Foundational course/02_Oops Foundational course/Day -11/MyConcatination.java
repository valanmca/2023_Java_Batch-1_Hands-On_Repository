package com.mahesh.Oops_day11;

public class MyConcatination {

	void concat(int value_one,int value_two)
	
	{ 	
		String res2 = Integer.toString(value_two);
		String res1 = Integer.toString(value_one);		
		System.out.println("Concat :"+value_one+value_two);
	}
	void concat(float v1,float v2)
	{
		String res2 = Float.toString(v1);
		String res1 = Float.toString(v2);		
		System.out.println("Concat :"+v1+v2);	
	}
	void concat(String s1,String s2)
	{
		System.out.println("concat :"+s1+""+s2);
	}
	
	
	public static void main(String[] args) {
		MyConcatination ob = new MyConcatination();
		ob.concat(0.989f, 0.89f);
		ob.concat(8, 6);
		ob.concat("niraa..", "♪♪♪♪♪");
		
		int a=10;int b=20;
		float c =2.90f;
		float d =(float)a+b;
		System.out.println("ans"+d);
		

	}

}
