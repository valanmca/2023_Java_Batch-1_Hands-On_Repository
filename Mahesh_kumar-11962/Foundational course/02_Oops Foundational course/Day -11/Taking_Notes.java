package com.mahesh.Oops_day11;


class Leafs {
	void view() {
		System.out.println("Taking Notes by using leafes");
	}
}

class Slates {
	void view() {
		System.out.println("Taking Notes by using Slates");
	}
}

class NoteBook {

	void view() {
		System.out.println("Taking Notes by using NoteBooks");
	}
}

class Laptop {
	void view() {
		System.out.println("Taking Notes by using Laptop");
	}
}

class Smartphone {
	void view() {
		System.out.print("Taking Notes by using Smartphone");
	}
}

class person {
	public void notetaking(Leafs stick) {
		stick.view();
	}

	public void notetaking(Slates chalk) {
		chalk.view();
	}

	public void notetaking(NoteBook pen) {
		pen.view();
	}
	
	public void notetaking(Laptop key) {
		key.view();
	}
	public void notetaking(Smartphone touch) {
		touch.view();
	}
	
}

public class Taking_Notes {

	public static void main(String[] args) {

		Leafs stick = new Leafs();
		person note_1 = new person();
		note_1.notetaking(stick);

		Slates chalk = new Slates();
		person note_2 = new person();
		note_2.notetaking(chalk);
		
		NoteBook pen = new NoteBook();
		person note_3 = new person();
		note_3.notetaking(pen);
		
		Laptop key = new Laptop();
		person note_4 = new person();
		note_4.notetaking(key);
		
		Smartphone touch = new Smartphone();
		person note_5 = new person();
		note_5.notetaking(touch);
	}

}
