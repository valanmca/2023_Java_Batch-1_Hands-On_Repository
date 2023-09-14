package com.mahesh.ds_day2;
import java.util.ArrayList;

public class Array_List_Mehods {

	public static void main(String[] args) {
		ArrayList lst =new ArrayList();
		lst.add(10);
		lst.add(20);
		lst.add(2,30);
		lst.add(2,40); //40 stores 2nd index (Update 30->40)
		lst.add(2,400);//400 stores 2nd index (Update 40->400)
		System.out.println("ArrayList Size : "+lst.size());
		System.out.println("ArrayList values : "+lst);
		
		lst.remove(0);//remove the value using index 
		System.out.println("ArrayList Size : "+lst.size());
		System.out.println("ArrayList values : "+lst);
		
		lst.removeAll(lst);//remove all value 
		System.out.println("ArrayList Size : "+lst.size());
		System.out.println("ArrayList values : "+lst);

	}

}
