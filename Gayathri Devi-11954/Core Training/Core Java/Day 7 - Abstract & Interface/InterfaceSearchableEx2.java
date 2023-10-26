package com.gayathri.day6;
/*
 * Write a java program to create an interface Searchable with a method search(String keyword) that searhces for a given keyword in a
 * text document. Create two classes document and webpage that implement the searchable interface and provide their own implementations
 * of the search() method.
 */
interface Searchable{
	void search(String originalword, String searchword);
}
class Document implements Searchable{
	public void search(String originalword, String searchword) {
		System.out.println(originalword.contains(searchword));
	}
	
}
class Webpage implements Searchable{
	
	public void search(String originalword, String searchword) {
		System.out.println(originalword.contains(searchword));
	}
}

public class InterfaceSearchableEx2 {

	public static void main(String[] args) {
		Searchable docobj = new Document();
		docobj.search("Gayathri Devi", "ya");//true
		
		Searchable webobj = new Webpage();
		webobj.search("Yathrik Shyam", "Sam");//false

	}

}
