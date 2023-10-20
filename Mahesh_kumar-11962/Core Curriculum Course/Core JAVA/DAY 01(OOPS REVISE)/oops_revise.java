package com.mahesh.core_java;
import java.util.*;
public class oops_revise {

	int empid;
	String empname;
	
	oops_revise(int empid, String empname)
	{
		this.empid=empid;
		this.empname =empname; 
	}
	
	void disp()
	{
		System.out.println(" ID :"+empid);
		System.out.println(" Name :"+empname);
	}
	
	public static void main(String[] args) {
		oops_revise cl = new oops_revise(12,"Mahesh");
		oops_revise cl_2 = new oops_revise(33,"Aravind");
		oops_revise cl_3 = new oops_revise(43,"Dom");
		oops_revise cl_4 = new oops_revise(53,"PURUSH");
		
		
		cl.disp();
		cl_2.disp();
		cl_3.disp();
		cl_4.disp();
		
		
		
		
		

	}

}
