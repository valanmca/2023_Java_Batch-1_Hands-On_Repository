package oops9;

public class student {
	String name;
	int m1,m2,m3,sum,avg;
	
	
	student(String name, int m1,int m2, int m3){
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	int getSum() {
		sum = m1 + m2 + m3;
		return sum;
	}
	int getAvg() {
		avg=sum/3;
		return avg;
		
		
	}
	void display() {
		
		System.out.println("student name " +name);
		System.out.println("mark 1 :" +m1);
		System.out.println("mark 2 :" +m2);
		System.out.println("mark 3 :" +m3);
		System.out.println("total: " +getSum());
		System.out.println("average:" +getAvg());
		
	}

	public static void main(String[] args) {
		
		student hephzibah=new student("hephzi", 90,99,95);
		hephzibah.display();
		
		student swetha=new student("swetha", 97,91,90);
		swetha.display();
		

	}

}
