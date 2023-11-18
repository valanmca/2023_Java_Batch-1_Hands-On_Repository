//Example for Ordinary classes
package com.sara.CoreJava.Day_17;

import java.util.Objects;

public final class OrdinaryClass {

	private final int id;
	private final String name;

	public OrdinaryClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	int id() {
		return this.id;
	}

	String name() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof OrdinaryClass other) {
			return Objects.equals(id, other.id) && Objects.equals(name, other.name);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Employee Details[id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		OrdinaryClass firstObject = new OrdinaryClass(101, "Sara");

		System.out.println(firstObject.id());
		System.out.println(firstObject.name());
		System.out.println(firstObject.hashCode());
		System.out.println(firstObject.toString());
		System.out.println(firstObject.equals(firstObject));
		System.out.println("****************");

		OrdinaryClass secondObject = new OrdinaryClass(102, "Virat");

		System.out.println(secondObject.id());
		System.out.println(secondObject.name());
		System.out.println(secondObject.hashCode());
		System.out.println(secondObject.toString());
		System.out.println(secondObject.equals(secondObject));
		System.out.println("******************");
	}

}
