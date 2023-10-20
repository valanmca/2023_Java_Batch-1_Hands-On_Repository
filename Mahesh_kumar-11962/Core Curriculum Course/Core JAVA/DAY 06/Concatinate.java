package com.mahesh.core_java_day_06;

public class Concatinate {

	
	void concate(int v1,int v2)
	{
		System.out.println(v1+" "+v2);
	}
	void concate(String v1,String v2)
	{
		System.out.println(v1+" "+v2);
	}
	void concate(float v1,float v2)
	{
		System.out.println(v1+" "+v2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concatinate add = new Concatinate();
		add.concate(2,4);
		add.concate(8.56f,6.68f);
		add.concate("Mahesh","kumar");

	}

}
