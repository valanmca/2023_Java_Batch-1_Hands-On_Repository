package com.mahesh.core_java_day_17_v11;

public class MainClass {

	
	private void dis()
	{
		System.out.println("hello");
	}
	class nested
	{
		void msg()
		{
			dis();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass m = new MainClass();
		MainClass.nested n = m.new nested();
		n.msg();

	}

}
