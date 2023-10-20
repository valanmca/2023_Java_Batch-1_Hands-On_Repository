//Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword 
//in a text document. Create two classes Document and WebPage that implement the Searchable interface
//and provide their own implementations of the search() method.

package com.dharshu.day6;

interface searchable{
	void search( String actual,String Keyword);
}

class Document implements searchable{
		 public void search(String actual,String keyword ) {
		        System.out.println(actual.contains(keyword));
	}
}

class WebPage implements searchable{
	 public void search(String actual,String keyword) {
         System.out.println(actual.contains(keyword));
     }
}

public class Ex_02_Search_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document obj=new Document();
        obj.search("Minion is my fav toy" ,"Minion");
        
        WebPage obj1=new WebPage();
        obj.search("Dharshu","M");
	}

}
