package Day6;
class employee1{
	String name;
    int salary;

	 employee1()
     {
          name = null;
          salary = 0;
     }
     employee1 (String name, int salary)
     {
          this.name = name;
          this.salary = salary;
     }
     int getSalary()
     {
          return salary;
     }
 }
class manager extends employee1{
	    int th, ta;
	     manager()
	     {
	          super();
	          th = ta = 0;
	     }
	     manager(String n, int sal, int h, int t)
	     {
	          super(n, sal);
	          th = h;
	          ta = t;
	     }
	     int getSalary()
	     {
	          return (super.getSalary()+th+ta);
	     }
	}

class Programmer extends employee1{
	  int  sal, sal1;
	  Programmer()
	  {
		  super();
		  sal = sal1 =0;
	  }
	  Programmer(String n, int sal, int h,int t){
		  super(n, sal);
		  sal =h;
		  sal1=t;
	  }
	  int getsalary() {
		  return (super.getSalary()+sal+sal1);
	  }
}
	

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  manager m1 = new manager("Nikhil",20000,500,1500);
          System.out.println("Salary of Manager= "+m1.getSalary());
          
          Programmer p2 =new Programmer("Muthuraj",50000,600,1200);
          System.out.println("Salary of Programmer= "+p2.getSalary());

	}

}
