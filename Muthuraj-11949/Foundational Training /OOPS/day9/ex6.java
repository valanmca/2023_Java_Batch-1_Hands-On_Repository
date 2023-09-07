package com.muthu.day9;

 class employee{
	static String org="Relevantz";
	 int eid;
	 

	 employee(int eid){
	 this.eid=eid;
	 }
	 //methods
	 void display() {
		 System.out.println("Employee Organization:"+org);
		 System.out.println("Employee id:"+eid);
		 
		 
	 }
	 public class ex6 {
	 
	public static void main(String[] args) {
		 
		 employee muthu=new employee(101);
		 muthu.display();
		 
		 employee dominc=new employee(102);
		 dominc.display();
	

	}
	 }}

