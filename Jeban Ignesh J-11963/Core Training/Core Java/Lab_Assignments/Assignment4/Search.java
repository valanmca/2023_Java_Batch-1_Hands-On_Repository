package com.jeban.Assignment4;

interface Searchable {
	void Search(String name, String keyword);
}

class Document implements Searchable {
	public void Search(String name, String keyword) {
		System.out.println(name.contains(keyword));
	}

}

class Webpage implements Searchable {
	public void Search(String name, String keyword) {
		System.out.println(name.contains(keyword));
	}
}

public class Search {

	public static void main(String[] args) {
		Document S = new Document();
		S.Search("Jeban Ignesh", "john");
		Webpage S1 = new Webpage();
		S1.Search("Mahesh Joker", "Joker");

	}

}
