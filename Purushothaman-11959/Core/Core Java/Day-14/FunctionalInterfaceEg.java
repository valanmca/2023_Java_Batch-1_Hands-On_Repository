package com.purushoth.day_14;

interface printable{
	default void say() {
		System.out.println("Welcome");
	}
	void print(String msg);
    }

public class FunctionalInterfaceEg implements printable {
	public void print(String msg) {
		System.out.println(msg);
    }

	public static void main(String[] args) {
		FunctionalInterfaceEg fi=new FunctionalInterfaceEg();
		fi.say();
		fi.print("Start Java");

	}

}


