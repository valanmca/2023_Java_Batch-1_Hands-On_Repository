package Core_Topic_Domnic_Day_8;

public class finallyex {

	public static void main(String[] args) {
    int a=10;
    int b=0;
    int c=0;
    int d=7;
    int e=0;
    
    try {
    	e=d+c;
    	c=a/b;
    }
    catch(Exception ex){
    	System.out.println(ex);
    }
    
    finally {
    System.out.println(e);
    System.out.println(c);
    }
    
	}

}
