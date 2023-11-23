package Day5;
class employee{   //class
	int empid;
	String empname;
	double Salary;
	
	employee(int empid,String empname,double Salary)///parameter Constructor
	{
        this.empid=empid;
        this.empname=empname;
        this.Salary=Salary;
		
	}
	//method
	void dispaly() {
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee name:"+empname);
		System.out.println("Employee salary:"+Salary);
	}
			
}
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     employee obj=new employee(111,"muth",6546);///Objective create  
     obj.dispaly();
	}

}
