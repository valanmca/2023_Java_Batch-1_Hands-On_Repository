// Write a Java Programs to create an interfaces Searchable with a method search(String Keyword) that searches for a given keyword in a text document . Create two classes Document and WebPage that Implements the Searchable interface and provide their own implementations of the search() method.
interface Searchable {
	boolean search(String keyword);
}

class Document implements Searchable {
	public String String;

	public Document(String String) {
		this.String = String;
	}

	public boolean search(String keyword) {
		return String.contains(keyword);
	}
}

class WebPage implements Searchable {
	public String url;
	public String htmlwebpages;

	public WebPage(String url) {
		this.url = url;
		this.htmlwebpages = htmlwebpages;
	}

	public boolean search(String keyword) {
		return url.contains(keyword);
	}
}

public class Abstract_Class_Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document obj = new Document("Hii I am PravinKumar RajaSahayam");
		boolean DocumentContainsSearch = obj.search("Hii");
		System.out.println("The word" + " " + "Hii" + " " + "is" + " " + DocumentContainsSearch);
		WebPage objs = new WebPage("https://webpages.com This is my webpage");
		boolean WebPageContainsSearch = objs.search("webpage");
		System.out.println("The word" + " " + "webpage" + " " + "is" + " " + WebPageContainsSearch);
	}

}