package Day_7;

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

public class InterfaceAss2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Document obj=new Document();
        obj.search("Minion is my fav toy" ,"Minion");
        
        WebPage obj1=new WebPage();
        obj.search("Dharshu","M");
    }

}
