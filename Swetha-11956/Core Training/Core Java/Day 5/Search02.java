//Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword 
//in a text document. Create two classes Document and WebPage that implement the Searchable interface
//and provide their own implementations of the search() method.

package JavaOops5;

interface Searchable{
	void Search (String data,String keyword);
}

class Document implements Searchable{
	public void  Search(String data,String keyword) {
		if(data.contains(keyword)) {
			System.out.println("Keyword is present in the document");
		}
		else {
			System.out.println("Keyword is not present in the document");
		}
	}
}
class WebPage implements Searchable{
	public void Search (String data, String keyword) {
		if(data.contains(keyword)) {
			System.out.println("Keyword is present in the webpage");
		}
		else {
			System.out.println("Keyword is not present in the webpage");
		}
	}
	
}
public class Search02 {

	public static void main(String[] args) {

		Searchable obj=new Document();
		obj.Search("hello","lo");
		obj.Search("hello","w");
		System.out.println("");
		
		Searchable obj1=new WebPage();
		obj1.Search("hai", "p");
		obj1.Search("hai", "h");
		
		
	}

}
