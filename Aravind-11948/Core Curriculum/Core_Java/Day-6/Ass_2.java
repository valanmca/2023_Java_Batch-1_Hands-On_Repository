package com.core.day_06;

interface Searchable {
	void search( String name,String keyword);
}

class Document implements Searchable{
	 public void search(String name,String keyword ) {
//		System.out.println(name.contains(keyword));
		boolean result=name.contains(keyword);
		
		if (result==true)
		{
			System.out.println("Keyword is present");
		}
		else {
			System.out.println("Keyword is absent");
		}
	 }
}
class WebPage implements Searchable{
	 public void search(String name,String keyword) {
//		 System.out.println(name.contains(keyword));
		 boolean result=name.contains(keyword);
			
			if (result==true)
			{
				System.out.println("Keyword is present");
			}
			else {
				System.out.println("Keyword is absent");
			}
	 }
}

public class Ass_2 {

	public static void main(String[] args) {
		Document obj=new Document();
		obj.search("Aravind is a good boy " ,"Aravind");
		
		WebPage obj1=new WebPage();
		obj1.search("Domnic","D");

	}

}
