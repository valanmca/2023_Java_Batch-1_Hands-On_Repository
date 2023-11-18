//Example for Functional Interface
package com.sara.CoreJava.Day_15;

interface printable {
	void print(String msg); // Abstract Method
}

public class FunctionalInterface implements printable {
	public void print(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterface fi = new FunctionalInterface();
		fi.print("Start Java");

	}

}
