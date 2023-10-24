package com.purushoth.day_05;

interface Searchable {
	void search(String value,String keyword);
}

class Document implements Searchable {
	public void search(String value,String keyword) {
		if(value.contains(keyword)==true) {
			System.out.println("The given string is found");
		}
		else {
			System.out.println("The given string is not found");
		}
	}
}

class Webpage implements Searchable {
	public void search(String value,String keyword) {
		if(value.contains(keyword)==true) {
			System.out.println("The given string is found");
		}
		else {
			System.out.println("The given string is not found");
		}
	}
}
public class Identify {

	public static void main(String[] args) {
       Document doc=new Document();
       doc.search("Document","Kum");
       Webpage web=new Webpage();
       web.search("Webpage","Web");
	}

}
