package oops_1;

public class student {
	String Name;
	int eng, tam, sci, mat, sum, avg;
	
	student(String Name, int eng, int tam, int mat, int sci){
		this.Name=Name;
		this.eng=eng;
		this.tam=tam;
		this.mat=mat;
		this.sci=sci;	
    }
	int sum() {
		sum=eng+tam+mat+sci;
		return sum;
	}
	int avg() {
		avg=sum/4;
		return avg;
	}
	
	void display(){
		System.out.println("English:"+eng);
		System.out.println("Tamil:"+tam);
		System.out.println("Maths:"+mat);
		System.out.println("Science:"+sci);
		System.out.println("Total Marks:"+sum());
		System.out.println("Average:"+avg());		
	}
	public static void main(String[] args) {
		student obj=new student("hephzi",99,98,99,96);
		obj.display();

	}

}
