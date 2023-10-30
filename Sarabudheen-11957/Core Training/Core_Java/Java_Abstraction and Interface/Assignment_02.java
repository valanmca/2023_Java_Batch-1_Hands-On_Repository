///**** Java program to create and implementing the Searchable interface ****/
package com.sara.CoreJava.Day_07;

interface Searchable {

	void search(String data, String keyword);
}

class Document implements Searchable {
	public void search(String data, String keyword) {

		if (data.contains(keyword)) {
			System.out.println(keyword + " is Founded in " + data);
		}

		else {
			System.out.println(keyword + " is Not Founded " + data);
		}

	}
}

class Webpage implements Searchable {
	public void search(String data, String keyword) {
		if (data.contains(keyword)) {
			System.out.println(keyword + " is Founded in " + data);
		}

		else {
			System.out.println(keyword + " is Not Founded in " + data);
		}
	}
}

public class Assignment_02 {
//
	public static void main(String[] args) {

		Document doc = new Document();
		doc.search("This is a sample document.", "sample");

		Webpage web = new Webpage();
		web.search("This is a sample webpage.", "webpage");

	}

}
