package Core_Topic_Domnic_Day_7;

interface Searchable{
	void search(String value,String keyword);
}
class Document implements Searchable{
	public void search(String value,String keyword) {
		
		if(value.contains(keyword)==true) {
			System.out.println(value+" contains "+keyword);
		}
		else {
			System.out.println(value+" does not have "+keyword);

		}
	}
}

class Webpage implements Searchable{
public void search(String value,String keyword) {
	if(value.contains(keyword)==true) {
		System.out.println(value+" contains "+keyword);
	}
	else {
		System.out.println(value+" does not have "+keyword);

	}
	}
}

public class Assg_2 {

	public static void main(String[] args) {
     Document obj1=new Document();
     obj1.search("Domnic", "dev");
     Webpage obj2=new Webpage();
     obj2.search("Leodas", "das");
	}

}
