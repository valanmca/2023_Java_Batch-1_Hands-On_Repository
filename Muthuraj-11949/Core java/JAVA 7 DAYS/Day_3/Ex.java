package Day_3;

class Employee{
	int Id;
	String name;
	Float salary;


	 Employee(int Id,String name,Float salary){
		 this.Id=Id;
		 this.name= name;
		 this.salary=salary;
	 }
	 void dispaly() {
		 System.out.println("Employee Id:"+Id);
		 System.out.println("Employee name:"+name);
		 System.out.println("Employee salary:"+salary);
	 }
}
public class Ex {
	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Muthu",2000.0f);
		//Create the Obj1
		
		Employee emp2=new Employee(102,"Valan",2000.0f);
		//Create the Obj2
		
		Employee emp[]=new Employee[2];
		emp[0] =emp1;
		emp[1]= emp2;
		
		for(int i=0; i<emp.length; i++) {
			emp[i].dispaly();
		}
	}
}
