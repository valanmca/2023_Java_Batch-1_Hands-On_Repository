package Core_Topic_Domnic_Day_3;


class Employee{
	  String ename;
	  int empid;
	  float esal;
	  
	  Employee(String ename,int empid,float esal){
		  this.ename=ename;
		  this.empid=empid;
		  this.esal=esal;
	  }
	  void display() {
		  System.out.println("Name of the employee is "+ename);
		  System.out.println("Emp Id of the employee is "+empid);
		  System.out.println("Salary of the employee is "+esal);
	  }
	  
	}


public class Arr_1 {

	public static void main(String[] args) {
		Employee obj1=new Employee("Domnic",11964,3200.0f);
		Employee obj2=new Employee("Mahesh",11962,2200.0f);
		
		
		//obj1.display();
		//System.out.println();
		//obj2.display();
       Employee emp[] = new Employee[2];
       
       emp[0]=obj1;
       emp[1]=obj2;
       
       for(int i=0;i<emp.length;i++) {
    	   emp[i].display();
       }
	}

}
