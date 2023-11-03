package com.gayathri.day5;

public class P1ClassAndObjects {
	//Instance vs Static
	static int a = 10;
	int s = 40;

	public static void main(String[] args) {

				P1ClassAndObjects obj1 = new P1ClassAndObjects();
				P1ClassAndObjects obj2 = new P1ClassAndObjects();
				P1ClassAndObjects obj3 = new P1ClassAndObjects();
				
				System.out.println(obj1.a);
				System.out.println(obj2.a);
				System.out.println(obj3.a);
				System.out.println(obj1.s);
				System.out.println(obj2.s);
				System.out.println(obj3.s);
				
				obj1.a = 50;
				obj1.s = 60;
				
				System.out.println(obj1.a);
				System.out.println(obj2.a);
				System.out.println(obj3.a);
				System.out.println(obj1.s);
				System.out.println(obj2.s);
				System.out.println(obj3.s);
			}

		}