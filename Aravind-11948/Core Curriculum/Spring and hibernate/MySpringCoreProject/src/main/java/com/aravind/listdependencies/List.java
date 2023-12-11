package com.aravind.listdependencies;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
	private ArrayList<String > list;
	
   public List() {
		super();
		// TODO Auto-generated constructor stub
	}


    public List(ArrayList<String> list) {
		super();
		this.list = list;
	}
	
    @Override
	public String toString() {
		return "Question: [" + list + "]";
	}


	void show()
    { 
    	Iterator<String>itr=list.iterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    }
	

}
