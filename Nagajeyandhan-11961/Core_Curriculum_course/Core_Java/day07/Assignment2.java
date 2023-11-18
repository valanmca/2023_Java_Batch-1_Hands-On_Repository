package com.jeyandhan.day07;

interface Searchable{
	void search(String data,String keyword);
}

class Document implements Searchable{
	public void search(String data,String keyword) {
		
		if(data.contains(keyword)) {
			System.out.println("The given string is found... "+keyword);	
		}
		else {
			System.out.println("The given string is not found... ");
		}
}

	
}

class WebPage implements Searchable{
	public void search(String data,String keyword) {
		if(data.contains(keyword)) {
			System.out.println("The given string is found... "+keyword);	
		}
		else {
			System.out.println("The given string is not found... ");
		}
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		
		Document doc = new Document();
		WebPage web = new WebPage();
		
		doc.search("Document", "Document");
		web.search("WebPage", "WebPage");
	}

}
