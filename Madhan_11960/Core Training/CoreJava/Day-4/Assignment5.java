package com.madhan.coreday4;
import java.util.ArrayList;
import java.util.Scanner;

class School
{
	ArrayList<String> students=new ArrayList<String>();
	ArrayList<String> teachers=new ArrayList<String>();
	ArrayList<String> schoolClass=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	

  public void addStudent()
  {
	  System.out.println("Add student :");
	  students.add(sc.next());
  }
}
public class Assignment5 {

	public static void main(String[] args) {
		School s1=new School();
		s1.addStudent();

	}

}
