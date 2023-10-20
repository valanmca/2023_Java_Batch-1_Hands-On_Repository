package com.mahesh.core_java_day_07;

interface Searchable {
	void search(String Word, String keyword);

}

class Document implements Searchable {

	public void search(String Word, String keyword) {
		
		System.out.println("Search & Show");
		if(Word.contains(keyword)==true)
		{
			System.out.println(keyword +" : Key word is found successfully");
		}
		else
		{
			System.out.println(keyword+" : key word is not found");
		}
	}
}
	class Webpage implements Searchable {

		public void search(String web, String site) {
			System.out.println("Search & Show");
			if(web.contains(site)==true)
			{
				System.out.println(site +" : website is found successfully");
			}
			else
			{
				System.out.println(site+" : website is not found");
			}
		}
	}

	public class File_Search {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Document file = new Document();
			file.search("Document", "ment");

			Webpage site = new Webpage();
			site.search("w3 schools", "col");

		}

	}

