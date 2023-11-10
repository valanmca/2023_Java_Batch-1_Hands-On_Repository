package com.madhan.coreday6;

interface Searchable
{
	boolean Search(String keyword);
	
}

class Document implements Searchable
{
	private String content;
	
	public Document(String content)
	{
		this.content=content;
	}
	public boolean Search(String keyword)
	{
		return content.contains(keyword);
	}
}

class Webpage implements Searchable
{
	private String url;
	private String htmlContent;
	
	public Webpage(String url, String htmlContent)
	{
		this.url=url;
		this.htmlContent=htmlContent;
	}
	public boolean Search(String keyword)
	{
		return htmlContent.contains(keyword);
	}
}
public class InterfaceAss2 {

	public static void main(String[] args) {
		
		Document doc=new Document("Java is Object Oriented Programming Language");
		boolean isFound=doc.Search("Has");
		System.out.println("Document contains :"+isFound);
		
		Webpage doc1=new Webpage("https://www.w3Schools.com","This is sample webpage");
		boolean isFound1=doc1.Search("sample");
		System.out.println("Webpage contains :"+isFound1);
		
	}

}
