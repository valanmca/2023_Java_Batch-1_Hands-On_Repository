package com.jenish.day6;
interface Searchable {
	void search(String actual, String keyword);
}
class Document implements Searchable {
	public void search(String actual, String keyword) {
	System.out.println(actual.contains(keyword));
	}
}
class WebPage implements Searchable {
	public void search(String actual, String keyword) {
		System.out.println(actual.contains(keyword));
		}
}
public class Ex_02_Searchable_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = new Document();
		doc.search("My name is Jenish", "Jeni");
		
		WebPage webpage = new WebPage();
		webpage.search("Jenish", "Immanuel");
	}

}
