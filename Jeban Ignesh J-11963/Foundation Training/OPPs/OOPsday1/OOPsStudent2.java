package com.jeban.OOPsday1;

class Student{
	//Variable
	int sId;
	String sName;
	String sFName;
	char sSection;
	float Percent;
	
	//Constructer
	Student(int sId,String sName,String sFName,char sSection,float Percent){
		this. sId=sId;
		this.sName=sName;
		this.sFName=sFName;
		this.sSection=sSection;
		this.Percent=Percent;
		}
	//Method
	void display() {
		System.out.println("sId:"+sId);
		System.out.println("sName:"+sName);
		System.out.println("sFName:"+sFName);
		System.out.println("sSection:"+sSection);
		System.out.println("Percent:"+Percent);
	
	}
	
	
	
}

public class OOPsStudent2 {

	public static void main(String[] args) {
		Student Jeban=new Student(101,"Jeban","Jebamalai",'A',99.0f);
		Jeban.display();
		Student Domnic=new Student(101,"Donic","Jebamalai",'A',99.0f);
		Jeban.display();
		

	}

}
