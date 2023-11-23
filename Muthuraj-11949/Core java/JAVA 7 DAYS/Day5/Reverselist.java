package Day5;

import java.util.ArrayList;

import java.util.Collections;
public class Reverselist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList <String>();
		
		list.add("Muthuraj");
		list.add("Johnson");
		list.add("Sam");
		list.add("main");
		list.add("Jeban");
		list.add("Dominc");
	
	
		System.out.println("This is Before name:"+list);
		Collections.reverse(list);
		System.out.println("This is After name:"+list);
	}

	

}
