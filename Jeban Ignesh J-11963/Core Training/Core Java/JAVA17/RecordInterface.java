package com.jeban.JAVA17;

interface Printable{
	void Print();
}
record Emp(String name,int id)implements Printable{

	@Override
	public void Print() {
		System.out.println("Name:"+name+",EmpId:"+id);
	}
	
}

public class RecordInterface {

	public static void main(String[] args) {
		Emp person1=new Emp("Jeban",11963);
		person1.Print();
		Emp person2=new Emp("Shaji",11962);
		person2.Print();

	}

}
