package Core_Topic_Domnic_Day_3;

public class String_5_equals_vs_doubleequaltooperator {

	public static void main(String[] args) {
       String s1=new String("Java");
       String s2=new String("Java");

       System.out.println(s1.equals(s2));  //true
       
       System.out.println(s1==s2);  //false  //for string comparison we
                                            //should not use == operator
       
       
       String s3="Java";
       String s4="Java";
       
       System.out.println(s3.equals(s4)); //true  //if a string has same value it won't need new space for it
       System.out.println(s3==s4);  //true        //so in this case it compares the same value with itself
	}

	
}
