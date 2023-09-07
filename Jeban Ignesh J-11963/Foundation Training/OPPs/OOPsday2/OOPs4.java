package com.jeban.OOPsday2;//Instance vs Static==Static

public class OOPs4 {

	static int a = 10;

	public static void main(String[] args) {
		OOPs4 obj1 = new OOPs4();
		OOPs4 obj2 = new OOPs4();

		System.out.println(OOPs4.a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj1.a = 50;
		System.out.println(obj1.a);
		System.out.println(obj2.a);

	}

}
