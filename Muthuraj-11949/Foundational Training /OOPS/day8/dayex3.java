package com.muthu.day8;
class Student{
	String name;
	int rollname;
	char section;
	//constructor
      Student(String name,int rollname,char section){
    	  this.name=name;
    	  this.rollname=rollname;
    	  this.section=section;  	  
      }
    	  //constructor
    	  void display() {
    		  System.out.println("Name:"+name);
    		  System.out.println("rollname:"+rollname);
    		  System.out.println("section:"+section);
    	  }  	  
      }	
public class dayex3 {

	public static void main(String[] args) {
		Student muthu=new Student("muthu",101,'A');
		muthu.display();
		
		Student dominc=new Student("dominc",101,'A');
		dominc.display();
	}
}
