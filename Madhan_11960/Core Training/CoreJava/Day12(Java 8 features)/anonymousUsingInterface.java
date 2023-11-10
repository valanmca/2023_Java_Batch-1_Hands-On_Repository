package com.madhan.lambda;

interface Polygon1 {
	   public void display();
	}

class AnonymousDemo1 {
	   public void createClass() {

	      // anonymous class implementing interface
	      Polygon1 p1 = new Polygon1() {
	         public void display() {
	            System.out.println("Inside an anonymous class");
	         }
	      };
	      p1.display();
	   }
	}

public class anonymousUsingInterface {

	public static void main(String[] args) {
		AnonymousDemo1 an = new AnonymousDemo1();
	      an.createClass();
	}

}
