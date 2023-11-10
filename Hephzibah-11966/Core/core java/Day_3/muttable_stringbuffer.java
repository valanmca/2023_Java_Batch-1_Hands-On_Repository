package Day_3;

public class muttable_stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("java");
		sb.append(" Worldddddddddddd");//after sapce it will add the capcity when capacity is 16 char
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb1.capacity());

	}

}
