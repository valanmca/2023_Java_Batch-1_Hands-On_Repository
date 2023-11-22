package oopsDay1_Day2;

public class student {
	String name;
	int m1;
	int m2;
	int m3;
	int avg;
	
	
	student(String name,int m1,int m2,int m3){
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
		
	}
	int avg() {
		avg=(m1+m2+m3)/3;
		return avg;
	}
	void display() {
		System.out.println("Student name: "+ name);
		System.out.println("Student mark1 : "+ m1);
		System.out.println("Student mark2 : "+ m2);
		System.out.println("Student mark3 : "+ m3);
		System.out.println("Student avg of marks  : "+ avg());
	}
	

	public static void main(String[] args) {
		student obj=new student("Arun",98,87,78);
		obj.display();

	}

}
