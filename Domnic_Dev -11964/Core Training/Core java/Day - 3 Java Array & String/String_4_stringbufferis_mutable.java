package Core_Topic_Domnic_Day_3;

public class String_4_stringbufferis_mutable {

	public static void main(String[] args) {
      StringBuffer sb=new StringBuffer("Domnic");
      sb.append("Dev");    //StringBuffer is mutable
      System.out.println(sb);  //DomnicDev 
      
      
      System.out.println(sb.capacity());  //16 + Domnic = 22
      
      sb.append("123456789");
      System.out.println(sb.capacity());  

	}

}
