package com.shiva.core.day06;

interface Searchable{
	void search(String org,String keyword);
}

class Document implements Searchable{
	public void search(String org,String keyword) {
		System.out.println(org.contains(keyword));
	}
}

class WebPage implements Searchable{
	public void search(String org,String keyword) {
		System.out.println(org.contains(keyword));
	}
}
public class Assign_02 {

	public static void main(String[] args) {
		Document obj=new Document();
		obj.search("Sankarasathasivam","Sankar");
		
		WebPage obj1=new WebPage();
		obj1.search("Java Programing", "Program");
	}

}
