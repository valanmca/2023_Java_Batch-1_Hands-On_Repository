package Day7;
interface Searchable{
	void search(String name,String keyword);
}

class Document implements Searchable{
	 public void search(String name,String keyword) {
	  System.out.println(name.contains(keyword));
       }
  }	 
class webpage implements Searchable{
		public void search(String name,String keyword) {
			System.out.println(name.contains(keyword));
		}	
	}
public class Ass2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Searchable obj=new Document();
		obj.search("Muthuraj","M");
		
		Searchable obj1=new  webpage();
		obj1.search("Mani","n");
		
		
	
	
	
		
		

	}

}
