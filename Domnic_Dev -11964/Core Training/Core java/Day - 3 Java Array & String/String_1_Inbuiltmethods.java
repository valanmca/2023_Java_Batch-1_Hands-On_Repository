package Core_Topic_Domnic_Day_3;

public class String_1_Inbuiltmethods {

	public static void main(String[] args) {
    String s1="Domnic";
    String s2=new String("domnic");
    char ch[]= {'D','O','M','N','I','C','D','E','V'};
    String s3=new String (ch);
    
    System.out.println(s1.equals(s2));  //false
    System.out.println(s1.equalsIgnoreCase(s2)); //true
    System.out.println(s3.charAt(1)); //O
    System.out.println(s1.indexOf('i'));  //4
    System.out.println(s3.lastIndexOf('D'));  //6
    System.out.println(s3.length());  //9
    System.out.println(s1.replace('n', 'm') + " / "+s1);  //Dommic / Domnic
    System.out.println(s2.toUpperCase());  //DOMNIC
    System.out.println(s3.toLowerCase());  //domnicdev
   
    String s4="The Batman";
    System.out.println(s4.substring(2,7)); //e Bat
    System.out.println(s4.substring(5));  //atman




	}

}
