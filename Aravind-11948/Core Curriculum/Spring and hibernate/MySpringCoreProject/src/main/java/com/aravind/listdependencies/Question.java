package com.aravind.listdependencies;

import java.util.Map;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private  List answers;
	private Map<Integer,String> map;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Question(int id, String name, List answers, Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
		this.map = map;
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" +answers.toString() + ", map=" + map + "]";
	}



//	public void display()
//	{
//		System.out.println("ID:"+id);
//		System.out.println("name:"+name);
//		System.out.println("Question:");
//		answers.show();
//		 
//	}
	
}
