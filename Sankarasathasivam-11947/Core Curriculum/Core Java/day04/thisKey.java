package com.shiva.core.day04;

public class thisKey {
	thisKey() {
		this(1);
		System.out.println("A");
	}

	thisKey(int a) {
		System.out.println("B");
	}

	public static void main(String[] args) {
		thisKey obj = new thisKey();

	}

}