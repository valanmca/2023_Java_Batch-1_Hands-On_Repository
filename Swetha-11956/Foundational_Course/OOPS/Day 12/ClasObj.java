package Practice1;
class Employee{
	private int eid;      //Data should not go outside,it is private property,it doesn't return the value when "obj.eSalary" is printed,for that getter method is used.
	private String ename;
	private int esalary;
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getEid() {        //getter method
		return eid;
	}
	public void setEid(int eid) {       //setter method
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	public void display() {
		System.out.println("\nThe Emp Id is :"+eid);
		System.out.println("The Employee name is :"+ename);
		System.out.println("The employee Salary is :"+esalary);
	}
}
public class ClasObj {

	public static void main(String[] args) {
		Employee obj=new Employee(11956,"swetha",40000);
		obj.display(); 
		
		obj.setEsalary(50000);
		obj.display(); 

	}

}
