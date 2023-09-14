package Assignment;
class Employee{
	private int eid;
	private String fristName;
	private String lastName;
	private int Salary;
	public int raisePercent;
	public Employee(int eid,String fristName,String lastName,int Salary) {
		super();
		this.eid = eid;
        this.fristName=fristName;
		this.lastName=lastName;
		this.Salary=getSalary();
	}
	public int getEid() {
		return eid;
	}
	public String getFristName() {
		return fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		return fristName+""+lastName;		
	}
	public int getSalary() {
		return Salary=1000;
	}
	public void setSalary(int salary) {
		this.Salary = Salary;
	}
	public int getAnnualSalary() {
		int annualSalary=12*Salary;
		return annualSalary;
	}
	public int raiseSalary(int percent) {
		double increaseAmount=(Salary*percent/100);
		Salary+=(int)increaseAmount;
		return Salary;	
	}
	public String toString() {
		return ("Employee[eid="+eid+",name="+getName()+",Salary="+Salary+"]");	}
}	
public class Testemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(11,"muthu","raj",12000);
		System.out.println("monthly Salary:"+employee.getSalary());
		System.out.println("Annual Salary:"+employee.getAnnualSalary());
		int risePercent = (12);
		int newSalary = employee.raiseSalary(risePercent);
		System.out.println("New Salary after"+risePercent+"%raise:"+newSalary);
		System.out.println( employee.toString());      
	}}
